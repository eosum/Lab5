package Server.Commands;

public interface Command {
    void execute(String args[], boolean fromFile);
}
