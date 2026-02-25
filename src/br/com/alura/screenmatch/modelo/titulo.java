package br.com.alura.screenmatch.modelo;

public class titulo {
    private String nomeDoTitulo;
    private int anoLancamento;
    private int totalAvaliacoesPorPessoa;
    private float avaliacaoDoFilme;
    private int duracaoEmMinuto;
    
    public String getNomeDoTitulo() {
        return nomeDoTitulo;
    }
    public void setNomeDoTitulo(String nomeDoTitulo) {
        this.nomeDoTitulo = nomeDoTitulo;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public int getTotalAvaliacoesPorPessoa() {
        return totalAvaliacoesPorPessoa;
    }
    public void setTotalAvaliacoesPorPessoa(int totalAvaliacoesPorPessoa) {
        this.totalAvaliacoesPorPessoa = totalAvaliacoesPorPessoa;
    }
    public float getAvaliacaoDoFilme() {
        return avaliacaoDoFilme;
    }
    public void setAvaliacaoDoFilme(float avaliacaoDoFilme) {
        this.avaliacaoDoFilme = avaliacaoDoFilme;
    }
    public int getDuracaoEmMinuto() {
        return duracaoEmMinuto;
    }
    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }


}
