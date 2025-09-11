# 🧾 Projeto: Simulador de Desconto por Faixa de Compra

Este projeto em Java simula o cálculo de desconto aplicado ao valor total de uma compra, com base em faixas pré-definidas. O objetivo é treinar lógica condicional, entrada de dados e boas práticas de exibição.

---

## 📌 Estrutura do Projeto

- **Entrada de dados:** Solicita ao usuário o valor total da compra.
- **Validação de faixa:** Verifica se o cliente está apto a receber desconto com base no valor informado.
- **Cálculo do desconto:** Aplica a taxa correspondente à faixa de valor.
- **Exibição de resultado:** Mostra o valor do desconto e o total a pagar após aplicação.

---

## 🛠️ Ferramentas e Recursos Utilizados

| Ferramenta | Finalidade |
|------------|------------|
| `Scanner` | Entrada de dados via terminal |
| `System.out.printf` | Exibição formatada das mensagens |
| Operadores aritméticos | Cálculo do valor de desconto |
| Estruturas condicionais (`if`, `else if`, `else`) | Definição das faixas de desconto |

---

## 📊 Regras de Desconto

| Faixa de Compra (Kz)       | Desconto Aplicado |
|----------------------------|-------------------|
| Acima de 1.000.000,00      | 10%               |
| Entre 500.000,00 e 999.999,99 | 7%            |
| Entre 100.000,00 e 499.999,99 | 4%            |
| Entre 50.000,00 e 99.999,99   | 2%            |
| Abaixo de 50.000,00        | Sem desconto      |

---

## 📁 Próximos Passos

- Refatorar o código com uso de funções (`métodos`)
- Substituir `float` por `BigDecimal` para maior precisão financeira
- Criar testes com diferentes valores de compra
- Evoluir para uma interface gráfica ou API REST

---

## 👨‍💻 Autor

**Jomaph** — Estudante de Informática de Gestão Financeira com foco em Fintech e aplicações financeiras. Este projeto faz parte da jornada de aprendizado em Java voltada para soluções reais no setor financeiro.
