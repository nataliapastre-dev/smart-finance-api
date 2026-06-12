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
📡 Endpoints da API
Converte/Processa Fala (Simulado)
URL: /api/speech/convert

Método: POST

Content-Type: application/json ou text/plain

📥 Exemplo de Requisição (Body)
JSON
{
  "audioData": "Texto de exemplo ou string Base64 representando o áudio"
}
📤 Exemplo de Resposta (Response - Status 200 OK)
JSON
{
  "status": "success",
  "recognizedText": "Texto reconhecido da fala (simulação)",
  "timestamp": "2026-06-12T10:17:32Z"
}
🚀 Como Executar o Projeto
Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:

Git

Java 21 JDK

Maven

Passo a Passo
Clone o repositório:

Bash
git clone git@github.com:nataliapastre-dev/smart-finance-api.git
Acesse a pasta do projeto:

Bash
cd smart-finance-api
Execute a aplicação:

Usando o Maven local:

Bash
mvn spring-boot:run
Usando o Maven Wrapper (Linux/Mac):

Bash
./mvnw spring-boot:run
Usando o Maven Wrapper (Windows):

DOS
mvnw.cmd spring-boot:run
A API estará disponível no endereço: http://localhost:8080

🎯 Aprendizados Adquiridos
Durante o desenvolvimento deste projeto, foi possível consolidar habilidades práticas essenciais para uma Desenvolvedora Backend:

Construção estruturada de APIs RESTful utilizando as anotações nativas do Spring (@RestController, @PostMapping, @RequestBody).

Implementação do padrão de injeção de dependências do Spring com @Service e @Autowired.

Configuração de políticas de segurança iniciais cross-origin (CORS) para viabilizar o consumo por aplicações web/mobile.

Gerenciamento de ciclo de vida do projeto e builds com o Apache Maven.

👩‍💻 Autora
Natália Baptista Pastre – Desenvolvedora em formação. Trabalhando na evolução técnica e compartilhando a jornada no desenvolvimento de software!

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
