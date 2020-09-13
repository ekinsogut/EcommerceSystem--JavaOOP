
package Patterns;

public class ContextStrategy {
    
    private Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void executeStrategy(int id) {
        strategy.operationDelete(id);
    }
 
}
