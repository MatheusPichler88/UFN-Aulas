import { useState, useEffect, useCallback } from 'react';
import { useAuth } from '@/contexts/AuthContext';
import { api, Task } from '@/services/api';
import { Button } from '@/components/ui/button';
import { Input } from '@/components/ui/input';
import { Checkbox } from '@/components/ui/checkbox';
import { CheckSquare, Plus, Trash2, LogOut, Loader2 } from 'lucide-react';
import { useNavigate } from 'react-router-dom';
import { toast } from 'sonner';

const Dashboard = () => {
  const { username, logout } = useAuth();
  const navigate = useNavigate();
  const [tasks, setTasks] = useState<Task[]>([]);
  const [loading, setLoading] = useState(true);
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [adding, setAdding] = useState(false);
  const [showForm, setShowForm] = useState(false);

  const fetchTasks = useCallback(async () => {
    try {
      const data = await api.getTasks();
      setTasks(data);
    } catch {
      toast.error('Erro ao carregar tarefas');
    } finally {
      setLoading(false);
    }
  }, []);

  useEffect(() => { fetchTasks(); }, [fetchTasks]);

  const handleAdd = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!title.trim()) return;
    setAdding(true);
    try {
      await api.createTask(title, description || undefined);
      setTitle('');
      setDescription('');
      setShowForm(false);
      toast.success('Tarefa criada!');
      fetchTasks();
    } catch (err: any) {
      toast.error(err.message);
    } finally {
      setAdding(false);
    }
  };

  const handleToggle = async (task: Task) => {
    const newDone = !task.done;
    try {
      await api.updateTask(task.id, { title: task.title, description: task.description, done: newDone });
      setTasks(prev => prev.map(t => t.id === task.id ? { ...t, done: newDone } : t));
      toast.success(newDone ? 'Tarefa concluída!' : 'Tarefa reaberta');
    } catch {
      toast.error('Erro ao atualizar');
    }
  };

  const handleDelete = async (id: number) => {
    try {
      await api.deleteTask(id);
      setTasks(prev => prev.filter(t => t.id !== id));
      toast.success('Tarefa removida');
    } catch {
      toast.error('Erro ao remover');
    }
  };

  const handleLogout = () => {
    logout();
    navigate('/auth');
  };

  const pending = tasks.filter(t => !t.done);
  const completed = tasks.filter(t => !!t.done);

  return (
    <div className="min-h-screen bg-background">
      {/* Header */}
      <header className="border-b border-border">
        <div className="max-w-2xl mx-auto px-4 py-4 flex items-center justify-between">
          <div className="flex items-center gap-3">
            <div className="flex items-center justify-center w-9 h-9 rounded-xl bg-primary">
              <CheckSquare className="w-5 h-5 text-primary-foreground" />
            </div>
            <h1 className="text-lg font-semibold font-heading text-foreground">Tarefas</h1>
          </div>
          <div className="flex items-center gap-3">
            <span className="text-sm text-muted-foreground">Olá, <span className="text-foreground font-medium">{username}</span></span>
            <Button variant="ghost" size="icon" onClick={handleLogout} title="Sair">
              <LogOut className="w-4 h-4" />
            </Button>
          </div>
        </div>
      </header>

      {/* Main */}
      <main className="max-w-2xl mx-auto px-4 py-8">
        {/* Stats */}
        <div className="grid grid-cols-2 gap-3 mb-8">
          <div className="glass-panel p-4 text-center">
            <p className="text-2xl font-bold font-heading text-foreground">{pending.length}</p>
            <p className="text-xs text-muted-foreground">pendentes</p>
          </div>
          <div className="glass-panel p-4 text-center">
            <p className="text-2xl font-bold font-heading text-accent">{completed.length}</p>
            <p className="text-xs text-muted-foreground">concluídas</p>
          </div>
        </div>

        {/* Add task */}
        {!showForm ? (
          <button
            onClick={() => setShowForm(true)}
            className="w-full task-card flex items-center gap-3 text-muted-foreground hover:text-foreground mb-6 cursor-pointer"
          >
            <Plus className="w-5 h-5 text-primary" />
            <span className="text-sm">Adicionar nova tarefa...</span>
          </button>
        ) : (
          <form onSubmit={handleAdd} className="glass-panel p-5 mb-6 space-y-3">
            <Input
              value={title}
              onChange={(e) => setTitle(e.target.value)}
              placeholder="Título da tarefa"
              maxLength={100}
              autoFocus
              className="bg-background border-border font-medium"
            />
            <Input
              value={description}
              onChange={(e) => setDescription(e.target.value)}
              placeholder="Descrição (opcional)"
              maxLength={500}
              className="bg-background border-border text-sm"
            />
            <div className="flex gap-2">
              <Button type="submit" size="sm" disabled={adding || !title.trim()}>
                {adding ? <Loader2 className="w-4 h-4 animate-spin" /> : <Plus className="w-4 h-4" />}
                Adicionar
              </Button>
              <Button type="button" variant="ghost" size="sm" onClick={() => { setShowForm(false); setTitle(''); setDescription(''); }}>
                Cancelar
              </Button>
            </div>
          </form>
        )}

        {/* Task list */}
        {loading ? (
          <div className="flex justify-center py-12">
            <Loader2 className="w-6 h-6 animate-spin text-primary" />
          </div>
        ) : tasks.length === 0 ? (
          <div className="text-center py-16">
            <div className="inline-flex items-center justify-center w-16 h-16 rounded-full bg-muted mb-4">
              <CheckSquare className="w-8 h-8 text-muted-foreground" />
            </div>
            <p className="text-muted-foreground text-sm">Nenhuma tarefa ainda. Crie a primeira!</p>
          </div>
        ) : (
          <div className="space-y-6">
            {pending.length > 0 && (
              <section>
                <h2 className="text-xs font-semibold text-muted-foreground uppercase tracking-wider mb-3">
                  Pendentes ({pending.length})
                </h2>
                <div className="space-y-2">
                  {pending.map(task => (
                    <TaskCard key={task.id} task={task} onToggle={handleToggle} onDelete={handleDelete} />
                  ))}
                </div>
              </section>
            )}

            {completed.length > 0 && (
              <section>
                <h2 className="text-xs font-semibold text-muted-foreground uppercase tracking-wider mb-3">
                  Concluídas ({completed.length})
                </h2>
                <div className="space-y-2">
                  {completed.map(task => (
                    <TaskCard key={task.id} task={task} onToggle={handleToggle} onDelete={handleDelete} />
                  ))}
                </div>
              </section>
            )}
          </div>
        )}
      </main>
    </div>
  );
};

function TaskCard({ task, onToggle, onDelete }: { task: Task; onToggle: (t: Task) => void; onDelete: (id: number) => void }) {
  const isDone = !!task.done;

  return (
    <div className={`task-card flex items-start gap-3 group ${isDone ? 'opacity-60' : ''}`}>
      <Checkbox
        checked={isDone}
        onCheckedChange={() => onToggle(task)}
        className="mt-0.5 border-border data-[state=checked]:bg-accent data-[state=checked]:border-accent"
      />
      <div className="flex-1 min-w-0">
        <p className={`text-sm font-medium text-foreground ${isDone ? 'line-through text-muted-foreground' : ''}`}>
          {task.title}
        </p>
        {task.description && (
          <p className="text-xs text-muted-foreground mt-0.5 truncate">{task.description}</p>
        )}
      </div>
      <Button
        variant="ghost"
        size="icon"
        className="opacity-0 group-hover:opacity-100 transition-opacity h-8 w-8 text-muted-foreground hover:text-destructive"
        onClick={() => onDelete(task.id)}
      >
        <Trash2 className="w-4 h-4" />
      </Button>
    </div>
  );
}

export default Dashboard;
