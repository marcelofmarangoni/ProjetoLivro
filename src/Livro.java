    public class Livro implements Publicacao {
        //Atributos
        private String titulo;
        private String autor;
        private int totalPags;
        private int pagAtual;
        private boolean aberto;
        private Pessoa leitor;

        // Métodos
        public String detalhes() {
            return "Livro {" +
                    "titulo = " + titulo +
                    ", autor = " + autor +
                    ", totalPags = " + totalPags +
                    ", pagAtual = " + pagAtual +
                    ", aberto = " + aberto +
                    ", leitor(a) = " + leitor.getNome() +
                    ", idade = " + leitor.getIdade() +
                    ", sexo = " + leitor.getSexo() +
                    '}';
        }

        public Livro(String titulo, String autor, int totalPags, Pessoa leitor) {
            this.titulo = titulo;
            this.autor = autor;
            this.totalPags = totalPags;
            this.aberto = false;
            this.pagAtual = 0;
            this.leitor = leitor;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getTotalPags() {
            return totalPags;
        }

        public void setTotalPags(int totalPags) {
            this.totalPags = totalPags;
        }

        public int getPagAtual() {
            return pagAtual;
        }

        public void setPagAtual(int pagAtual) {
            this.pagAtual = pagAtual;
        }

        public boolean isAberto() {
            return aberto;
        }

        public void setAberto(boolean aberto) {
            this.aberto = aberto;
        }

        public Pessoa getLeitor() {
            return leitor;
        }

        public void setLeitor(Pessoa leitor) {
            this.leitor = leitor;
        }

        @Override
        public void abrir() {
            this.aberto = true;
        }

        @Override
        public void fechar() {
            this.aberto = false;
        }

        @Override
        public void folhear(int p) {
            if (p > this.totalPags){
                this.pagAtual = 0;
            } else {
                this.pagAtual = p;
            }
        }

        @Override
        public void avancarPag() {
            this.pagAtual++;
        }

        @Override
        public void voltarPag() {
            this.pagAtual--;
        }
    }



