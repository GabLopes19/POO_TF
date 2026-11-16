public class Inventario {
    private Item[] itens;
    private int capacidade;

    public Inventario(int capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade não pode ser negativa.");
        }
        this.capacidade = capacidade;
        this.itens = new Item[capacidade];
    }

    public boolean adicionarItem(Item item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean removerItem(Item item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == item) {
                itens[i] = null;
                return true;
            }
        }
        return false;
    }

    public Item[] getItens() {
        return itens.clone();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQuantidadeItens() {
        int quantidade = 0;
        for (Item item : itens) {
            if (item != null) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
