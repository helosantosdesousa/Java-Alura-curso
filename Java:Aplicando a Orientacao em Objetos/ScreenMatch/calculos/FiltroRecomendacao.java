package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    //vc ta pegando o que da pra ser classificado
    // (série, episódio, filme e quem sabe usuário no
    // futuro
        public void filtra(Classificavel classificavel){ //vc ta pegando o que da pra ser classificado (série, episódio, filme e quem sabe usuário no futuro
        if (classificavel.getClassificacao()>=4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Mal avaliado");
        }
    }
}
