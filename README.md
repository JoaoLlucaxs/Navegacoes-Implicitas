# Entendendo Navegações em JSF

## A navegação NÃO IMPLICITA ela faz apenas 1 requisição , o que pode ocorrer é da tela "Home" para ->  "Detalhes" na barra de navegação <strong> ao voltar</strong> para Home estar na navegação "Detalhes"
  - Em seu XHTML insere dessa forma (action="Nome da página que quer ir") não precisa do .xhtml
  
  <img width=250 src="https://github.com/JoaoLlucaxs/Escopos_JSF/assets/92184255/991b78d1-2ddb-40ce-8849-65414766c245"/>
<img width=250 src="https://github.com/JoaoLlucaxs/Escopos_JSF/assets/92184255/90414033-825c-4c43-a668-ede1628d222e"/>

## Mas se você usuário quer favoritar uma página por exemplo, há a navegação IMPLICITA

- CUIDADO POIS A IMPLICITA OCORRE DUAS REQUISIÇÕES , ENTÃO DEPENDENDO DO SEU ESCOPO VOCÊ PODE PERDER A PRIMEIRA REQUISIÇÃO O QUE PODE OCASIONAR ERROS

- A IMPLICITA não ocorrerá aquele detalhe na barra de navegação como em uma navegação NÃO IMPLICITA
  - Em seu XHTML insira dessa forma ( action="Nome da página que quer ir?faces-redirect=true")
 
<img width=250 src="https://github.com/JoaoLlucaxs/Escopos_JSF/assets/92184255/5c3053f0-3089-4754-9d54-5a6c3ca376bd"/>
