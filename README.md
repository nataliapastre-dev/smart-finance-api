# 🚀 Smart Finance API

A **Smart Finance API** é uma API REST desenvolvida com Spring Boot que simula um sistema de reconhecimento de fala. Ela foi projetada para receber entradas de áudio (seja simuladas por texto puro ou strings codificadas em Base64) e processá-las para retornar uma resposta textual correspondente.

---

## 📌 Objetivo do Projeto

Este projeto foi desenvolvido com fins acadêmicos e práticos, buscando consolidar o conhecimento em desenvolvimento backend com o ecossistema Spring. Os principais focos foram:

- **Arquitetura Limpa:** Divisão clara de responsabilidades através da estruturação em camadas (Controller, Service, Config).
- **Padrões REST:** Criação de endpoints robustos e aderentes aos padrões HTTP.
- **Segurança de Acesso:** Configuração global de CORS para permitir integração com diferentes frontends.
- **Tratamento de Dados:** Manipulação e conversão de dados textuais e representações em Base64.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java 21
- **Framework:** Spring Boot 3.x (Spring Web)
- **Gerenciador de Dependências:** Maven
- **Banco de Dados:** H2 Database (In-Memory, configurado para evoluções futuras)
- **Versionamento:** Git & GitHub

---

## 📁 Estrutura do Projeto

O projeto segue a estrutura padrão recomendada pelo Spring Boot:

```text
src/main/java/com/natalia/smartfinanceapi
│
├── SmartFinanceApiApplication.java    # Classe principal de inicialização
│
├── controller/
│   └── SpeechController.java          # Exposição dos endpoints REST da API
│
├── service/
│   └── SpeechService.java             # Camada de regras de negócio e simulação da lógica
│
└── config/
    └── CorsConfig.java                # Configuração de permissões de CORS
