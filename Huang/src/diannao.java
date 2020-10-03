public class diannao {
    private InsertDrawable id;

    public diannao() {
    }

    public diannao(InsertDrawable id) {
        this.id = id;
    }

    public InsertDrawable getId() {
        return id;
    }

    public void setId(InsertDrawable id) {
        this.id = id;
    }

    public void inputD(InsertDrawable id){
        id.input();
    }

    public void outD(InsertDrawable id){
        id.out();
    }
}

