
# Olá, eu sou a Arth! 👋

Sou desenvolvedor mobile focado em Andriod, mas expedindo meus conhecimentos em KMP 

# Meu Portfólio App

Um aplicativo Android nativo desenvolvido em Kotlin para exibir portfólio de projetos e informações de contato.

## 🚀 Funcionalidades

- **Tela Principal**: Apresentação pessoal com foto de perfil e descrição
- **Projetos**: Galeria de projetos com imagens, descrições e links para GitHub
- **Contato**: Links diretos para GitHub, LinkedIn e email

## 🛠️ Tecnologias Utilizadas

- **Kotlin**: Linguagem principal
- **Android SDK**: Framework nativo
- **Material Design**: Componentes de UI modernos
- **View Binding**: Binding seguro de views
- **CircleImageView**: Imagem de perfil circular

## 📱 Estrutura do Projeto

```
app/src/main/
├── java/com/pdrarth/meupotifolio/
│   ├── MainActivity.kt          # Tela principal
│   ├── Projetos.kt             # Tela de projetos
│   ├── Contato.kt              # Tela de contato
│   ├── Constants.kt            # Constantes do app
│   └── utils/
│       └── IntentUtils.kt      # Utilitários para intents
├── res/
│   ├── layout/                 # Layouts XML
│   ├── values/
│   │   ├── colors.xml          # Paleta de cores
│   │   ├── strings.xml         # Strings do app
│   │   ├── styles.xml          # Estilos customizados
│   │   └── dimens.xml          # Dimensões centralizadas
│   ├── drawable/               # Drawables e backgrounds
│   └── anim/                   # Animações de transição
```

## ✨ Melhorias Implementadas

### 🔧 Refatoração de Código
- **Separação de responsabilidades**: Código organizado em métodos específicos
- **Constantes centralizadas**: URLs e valores hardcoded movidos para `Constants.kt`
- **Utilitários reutilizáveis**: Funções comuns em `IntentUtils.kt`
- **Nomenclatura consistente**: Variáveis e métodos seguindo convenções Kotlin
- **Remoção de duplicação**: Código repetitivo eliminado

### 🎨 Melhorias de Aparência
- **Toolbar com navegação**: Botão de voltar nas telas secundárias
- **Material Design**: Componentes modernos e consistentes
- **Ripple effects**: Feedback visual em botões e cards
- **Animações de transição**: Transições suaves entre telas
- **Paleta de cores expandida**: Mais opções de cores para futuras customizações

### 📐 Melhorias de UX
- **Tratamento de erros**: Feedback quando apps não estão disponíveis
- **Navegação intuitiva**: Botão de voltar funcional
- **Estilos centralizados**: Consistência visual em todo o app
- **Dimensões padronizadas**: Espaçamentos uniformes

## 🚀 Como Executar

1. Clone o repositório
2. Abra o projeto no Android Studio
3. Sincronize as dependências do Gradle
4. Execute o app em um emulador ou dispositivo físico

## 📋 Próximas Melhorias Sugeridas

- [ ] Implementar ViewModels para separação de lógica
- [ ] Adicionar testes unitários
- [ ] Implementar cache de imagens
- [ ] Adicionar modo escuro
- [ ] Implementar navegação com Navigation Component
- [ ] Adicionar animações de entrada para elementos
- [ ] Implementar pull-to-refresh na tela de projetos

## 👨‍💻 Desenvolvedor

**Pedro Arthur** - Desenvolvedor Android

- GitHub: [@PdrArth](https://github.com/PdrArth)
- LinkedIn: [Pedro Arthur](https://www.linkedin.com/in/pdrarth/)
- Email: pedroarthurpdrarth@gmail.com

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

