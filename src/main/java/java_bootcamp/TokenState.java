package java_bootcamp;

import com.google.common.collect.ImmutableList;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/* Our state, defining a shared fact on the ledger.
 * See src/main/java/examples/ArtState.java for an example. */
public class TokenState implements ContractState {
    private final Party issuer;
    private final Party owner;
    private int amount;
/*
* TODO: TestCase 1 "StateTestst.Java"
* 1) Implement ContractState Interface into TokenState class
* 2) Create its constructors , Getters .
* */
    public TokenState(Party issuer, Party owner, int amount) {
        this.issuer = issuer;
        this.owner = owner;
        this.amount = amount;
    }

    @NotNull
    @Override
    public List<AbstractParty> getParticipants() {

        return ImmutableList.of(issuer, owner);
    }

    public Party getIssuer() {
        return issuer;
    }

    public Party getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }
}