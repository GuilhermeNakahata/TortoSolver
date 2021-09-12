package tortoproversion;
public class EstruturaNo {
    private int numerono;
    private String conteudono;
    private int qtdligacoes;
    private int noligacoes[];
    private int qtd;
    private boolean visitado;
    
    public EstruturaNo(int numerono, String conteudono, int qtdligacoes, boolean visitado){
        this.numerono = numerono;
        this.conteudono = conteudono;
        this.qtdligacoes = qtdligacoes;
        this.visitado = visitado;
        noligacoes = new int[99];
        qtd = 0;
    }
    
    public String getConteudo(){
        return this.conteudono;
    }
    
    public void setNoLigacoes(int a){
        this.noligacoes[qtd] = a;
        qtd++;
    }
    
    public int getQtd(){
        return qtd;
    }
    
    public int getNoligacoes(int a){
        return noligacoes[a];
    }
    
    public int getQtdLigacoes(){
        return qtdligacoes;
    }
    
    public void setVisitado(boolean a){
        this.visitado = a;
    }
    
    public boolean getVisitado(){
        return this.visitado;
    }
    
}
