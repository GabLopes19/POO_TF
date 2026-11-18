
public abstract class Personagem extends Item {

    private String nome;
    private int vida;
    private int nivel;
    private int forca;
    private char inteligencia;
    private int defesa;
    private int mana;
    private int destreza;
    private Raca raca;

    public Personagem(String nome) {

        this.nome = nome;
        this.vida = 100;
        this.nivel = 1;
        this.forca = 10;
        this.inteligencia = 'C';
        this.defesa = 5;
        this.mana = 30;
        this.destreza = 7;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 5) {
            this.nome = nome;
        } else {
            System.out.println("O nome precisa ter 5 ou mais caracteres");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= this.vida) {
            this.vida = vida;
        } else {
            System.out.println("A vida não pode ser reduzida por este método");
        }
    }

    public Raca getRaca() {
    return raca;
    }
    
    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel > this.nivel) {
            this.nivel = nivel;
        } else {
            System.out.println("O nivel precisa ser maior que o atual");
        }
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca > this.forca) {
            this.forca = forca;
        } else {
            System.out.println("A força precisa ser maior que a atual");
        }
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        if (destreza > this.destreza) {
            this.destreza = destreza;
        } else {
            System.out.println("A destreza precisa ser maior que a atual");
        }
    }

    public char getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(char inteligencia) {
        if (inteligencia > this.inteligencia) {
            this.inteligencia = inteligencia;
        } else {
            System.out.println("A inteligencia precisa ser maior que a atual");
        }
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if (defesa > this.defesa) {
            this.defesa = defesa;
        } else {
            System.out.println("A defesa precisa ser maior que a atual");
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana > this.mana) {
            this.mana = mana;
        } else {
            System.out.println("A mana precisa ser maior que a atual");
        }
    }

    public int calcularDano(int numeroDado) {
        if (numeroDado > 0) {
            return getDanoItem() / numeroDado;
        }

        return 0;
    }

    public boolean subirNivel(int experiencia) {

        if (experiencia >= 30) {
            this.nivel++;
            return true;
        }

        return false;
    }

    public boolean receberDano(int dano) {

        if (dano > this.defesa) {
            this.vida -= dano;

            if (this.vida < 0) {
                this.vida = 0;
            }

            return true;
        }

        System.out.println("A defesa do personagem é maior que o dano recebido");
        return false;
    }
}
