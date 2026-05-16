# Perguntas reflexivas

### 1- Por que TrechoRodovia é uma classe e "BR-116 KM 10 ao 15" é um objeto? 

### R: Pois TrechoRodovia permite criar vários trechos (objetos) provindos de uma mesma classe, como o BR-116 KM 10 ao 15. Assim, sendo algo mais abrangente e melhorando a otimização, leitura e manutenção do código.
 
---
### 2- Se o nivelVegetacao fosse público, que tipo de "quebra" no sistema de previsão da Motiva um programador descuidado poderia causar?

### R: Poderia alterar sem querer o valor na classe principal, assim sendo fácil substituir dados de maneira não proposital, bagunçando as informações do site.