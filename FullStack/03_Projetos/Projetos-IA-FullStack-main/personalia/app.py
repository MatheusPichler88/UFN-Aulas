import streamlit as st
import google.generativeai as genai
# Configuração da chave (peça para os alunos gerarem no Google AI Studio)
genai.configure(api_key=st.secrets["general"]["api_key"])
model = genai.GenerativeModel('gemini-2.5-flash')
# Configuração da página
st.set_page_config(page_title="PersonalIA", page_icon="🏋️")
st.title(" PersonalIA: Tenha um personal rápido e fácil.") 
st.markdown("Crie, adapte e gere seus treinos de acordo com suas preferências.")

# --- INTERFACE ---
with st.sidebar:
 st.header("Preferências")
 foco_treino = st.multiselect("Foco do treino:",
 ["Cardio","Pernas", "Braços", "Costas", "Peitoral","Glúteo", "Abdômen","Ombros","Quadriceps"])
 tempo = st.slider("Duração máxima do treino (minutos):", min_value=15, max_value=120, value=45, step=5)
 mood = st.text_area("Descreva os equipamentos disponiveis, suas limitações:",
 placeholder="Ex: Estou em casa, tenho um halter de 10kg, tenho um colchonete e tenho artrose no joelho.")
botao_recomendar = st.button("Buscar Recomendações")
# --- LÓGICA DE PROCESSAMENTO ---
if botao_recomendar:
 if not mood:
    st.warning("Por favor, descreva suas limitações ou objetivos!")
 else:
    with st.spinner("Montando sua rotina de treinos personalizada..."):
        prompt = f"""
                    Você é um Personal trainer profissional.
                    Monte uma rotina de treinos personalizados com as seguintes prefêrencias{', '.join(foco_treino )} e que durem até {tempo}
                    minutos.
                    O usuário descreveu suas limitações e seus equipamentos como: '{mood}'.
                    Para cada exercicio, forneça: Número de séries e de repetições e alguma técnica avançada(DropSet,RestPause) e uma frase curta de motivação.
                    """

    
    try:
        response = model.generate_content(prompt)
        st.success("Aqui estão minhas sugestões:")
        st.markdown("---")
        st.write(response.text)
        
        col1, col2 = st.columns(2)
        with col1:
            if st.button(" Gostei 👍"): 
                with open("feedback.csv", "a") as f:
                    f.write(f"{mood},{foco_treino},{tempo},Gostei\n")
                st.success("Obrigado pelo seu feedback positivo!")
        with col2:
            if st.button(" Não gostei 👎"): 
                with open("feedback.csv", "a") as f:
                    f.write(f"{mood},{foco_treino},{tempo},Não gostei\n")
                st.info("Feedback registrado. Vamos melhorar!")
    except Exception as e:
        st.error(f"Erro ao conectar com a IA: {e}")

st.markdown("---")
st.caption("Desenvolvido na disciplina Desenvolvimento Full Stack – Sistemas de Informação - Universidade Franciscana (UFN)")