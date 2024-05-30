//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Fabiana", 45, "F");
        p[1] = new Pessoa("Marcelo", 44, "M");

        l[0] = new Livro("Aprendendo Java","Jose da Silva",300,p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado","Maria Candido", 800, p[0] );

        // System.out.println(l[0].detalhes());

        l[0].abrir();
        l[0].folhear(400);
        l[0].avancarPag();

        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());

        System.out.println(l[2].detalhes());

    }

    }
