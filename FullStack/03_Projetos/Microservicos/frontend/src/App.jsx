import React, { useState, useEffect } from 'react';
import axios from 'axios';
function App() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [token, setToken] = useState(localStorage.getItem('token'));
  const [notes, setNotes] = useState([]);
  const [newNote, setNewNote] = useState('');
  const API_AUTH = 'http://localhost:3001';
  const API_NOTES = 'http://localhost:3002';
  const handleLogin = async () => {
    try {
      const res = await axios.post(`${API_AUTH}/login`, { email, password });
      setToken(res.data.token);
      localStorage.setItem('token', res.data.token);
    } catch (err) {
      alert('Erro no login');
    }
  };
  const fetchNotes = async () => {
    const res = await axios.get(`${API_NOTES}/notes`, {
      headers: { Authorization: token }
    });
    setNotes(res.data);
  };
  const addNote = async () => {
    await axios.post(`${API_NOTES}/notes`, { content: newNote }, {
      headers: { Authorization: token }
    });
    setNewNote('');
    fetchNotes();
  };
  useEffect(() => {
    if (token) fetchNotes();
  }, [token]);
  if (!token) {
    return (
      <div style={{ padding: '20px' }}>
        <h1>Login - Sistema UFN</h1>
        <input type="email" placeholder="Email" onChange={e => setEmail(e.target.value)} />
        <input type="password" placeholder="Senha" onChange={e => setPassword(e.target.value)} />
        <button onClick={handleLogin}>Entrar</button>
      </div>
    );
  }
  return (
    <div style={{ padding: '20px' }}>
      <h1>Minhas Notas</h1>
      <input value={newNote} onChange={e => setNewNote(e.target.value)} placeholder="Nova nota..." />
      <button onClick={addNote}>Salvar</button>
      <ul>
        {notes.map(note => (
          <li key={note._id}>{note.content}</li>
        ))}
      </ul>
      <button onClick={() => { localStorage.clear(); setToken(null); }}>Sair</button>
    </div>
  );
}
export default App;
