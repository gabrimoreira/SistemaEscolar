package Application;

public class Clube {

    private String nome;
    private double overall;
    private Vector <Jogador> elenco;
    Financas financas;
    Campanha campanha;

    public Jogador[] definirEscalacoesPadrao(Vector<Jogador> elenco, int formacao){
        private Jogador[] EmCampo = new Jogador[11];
        private Jogador[] Ataque = this.selecionaAtacante();
        private Jogador[] MeioCampo = this.selecionaMeioCampo();
        private Jogador[] Zaga = this.selecionaZagueiro();
        private Jogador[] Goleiros = this.selecionaGoleiro();
        
        if(formacao == 1){
            //4-3-3
            //Esbalecimento de um algoritmo que calcularia o overall para essa formacao;
         }
        else if(formacao == 2){
            //4-4-2
        }
        else if(formacao == 3){
            //4-5-1
        }
        else if(formacao == 4){
            //4-2-4
        }
        else if(formacao == 5){
            //3-4-3
        }
        else if(formacao == 6){
            //3-5-2
        }
        else if(formacao == 7){
            //5-2-3
        }
        else if(formacao == 7){
             //5-4-1
        }
        else if(formacao == 8){{
            //5-3-2
        }
        else{
            //tem que tratar erro caso nenhuma dessa opcoes entrem;
        }
    }
//1. De acordo com certas formações: 4-3-3, 4-4-2, 4-5-1, 4-2-4, 3-4-3, 3-5-2, 5-2-3, 5-4-1, 5-3-2,  
//definir automaticamente de acordo com as qualidades para defensor, meiocampista e atacante dos jogadores do elenco, quais seriam os jogadores, que estando disponíveis, jogariam em cada uma dessas escalações. 
//Essas escalações são as que aparecerão antes da partida para que o usuário escolha.

//2. Definir uma função para determinar como ficaria o overall de cada setor do campo em cada escalação, baseando-se no número de jogadores que tem naquele setor naquela escalação específica e na qualidade deles para jogar naquele setor. 
//Estes dados serão usados durante a partida, influenciando a determinação de certos eventos(é isso inclusive que fará diferença entre o usuário escolher uma formação ou outra. Mais detalhes na descrição da simulação da partida).

//3. Define o overall geral do time com base na escalação que possuir maior média dos overalls de cada setor do campo


    public void exibirElenco(Vector<Jogador> elenco){

//1. Mostrar em ordem de posição quais jogadores estão compondo o elenco atualmente. Basicamente printar o vetor do elenco na ordem de posição, tambem pode dar ao usuario a opcao de ver por ordem de overall ou alfabetica

//2. Mostrar opção de ver estatísticas e qualidades dos jogadores exibidos

    }
    
    public void contratar(Jogador JogadorX){

//1. Conferir se está no período de tranferências

//2. Implementar mecanismo para buscar o jogador desejado, pode ser por nome, qualidade, posição, time, etc

//3. Conferir se o clube já tentou uma proposta por aquele jogador e foi recusada.

//4. Fazer proposta pelo jogador. Conferir se o valor se encaixa no orçamento atual do clube.

//5. Na semana seguinte receber a resposta do outro clube se ele aceita vender. Fazer a probabilidade de aceitar com base na importancia daquele jogador para o time (exemplo: se aquele jogador for vendido, o overall do time cai em x%, quanto maior x, mais difícil do clube aceitar).

//6. Se for recusado, exibir mensagem correspondente. Se for aceito, exibir a mensagem e subtrair o jogador do vetor de elenco do time que vendeu e adicionar ao vetor do time que comprou. Fazer o mesmo com o valor da transferência e com o salário do jogador nas finanças.

    }

    public void vender(Jogador JogadorX){

//1. Todos os jogadores do elenco terão chances de receberem porpostas de outros clubes, mas o usuário poderá colocar alguns à venda, aumentando a chance de receberem propostas.

//2. Automaticamente as propostas serão feitas com base no quanto um outro time precisaria daquele jogador (exemplo: se comprar meio campista fulano, o overall do time aumenta x%) e se cabe no orçamento atual daquele clube, daí o clube do usuário receberá a proposta.

//3. Usuário recebe mensagem com a proposta e opção para aceitar ou rejeitar. Aceitando, faz-se processo parecido com o da contratação mas inverso. 
    }
    public double getGeral(){
        return overall;
    }
    
    private Jogador[] selecionaGoleiro(){
        //fazerBusca do melhor goleiro apto a jogar
        private Vector <Jogador> Goleiros = new Vector<>();
        for (int i = 0; i < elenco.size(); i++) {
             if(elenco(i).equals("Goleiro") && elenco(i).AptoJogar()){
                 Goleiros.add(elenco.get(i));
             }
        }
    }
     private Jogador[] selecionaAtacante(){
        //fazerBusca Atacantes aptos a jogar
        private Vector <Jogador> Atacante = new Vector<>();
        for (int i = 0; i < elenco.size(); i++) {
            //Chega se eh a posicao de interesse e se esta apto
             if(elenco(i).equals("Atacante") && elenco(i).AptoJogar()){
                 Atacante.add(elenco.get(i));
             }
        }
    }
     private Jogador[] selecionaMeioCampista(){
        //fazerBusca dos MeioCampista aptos a jogar
        private Vector <Jogador> MeioCampista = new Vector<>();
        for (int i = 0; i < elenco.size(); i++) {
             if(elenco(i).equals("MeioCampista") && elenco(i).AptoJogar()){
                 MeioCampista.add(elenco.get(i));
             }
        }
         Jogador[] array = MeioCampista.toArray(new Jogador[MeioCampista.size()]);
         return array;
    }
     private Jogador[] selecionaZagueiro(){
        //fazerBusca dos Zagueiros aptos a jogar
        private Vector <Jogador> Zagueiro = new Vector<>();
        for (int i = 0; i < elenco.size(); i++) {
             if(elenco(i).equals("Zagueiro")){
                 Zagueiro.add(elenco.get(i));
             }
        }
         Jogador[] array = Zagueiro.toArray(new Jogador[Zagueiro.size()]);
         return array;
    }

    private Jogador[] selecionar(String posicao){
        //fazerBusca do melhor goleiro apto a jogar
        private Vector <Jogador> Goleiros = new Vector<>();
        for (int i = 0; i < elenco.size(); i++) {
             if(elenco(i).equals(posicao) && elenco(i).AptoJogar()){
                 Goleiros.add(elenco.get(i));
             }
        }
    }
    
}
 
