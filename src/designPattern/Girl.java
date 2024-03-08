package designPattern;

public class Girl {
    private BoyFriend problem;

    public Girl(BoyFriend problem){
        this.problem = problem;
    }

    public void clean(){
        problem.clean();
    }

    public void spend(){
        problem.spend();
    }

    public void cook(){
        problem.cook();
    }

    public void setProblem(BoyFriend problem){
        this.problem = problem;
    }

}
