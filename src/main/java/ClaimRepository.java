import java.util.List;
import java.util.Map;

public interface ClaimRepository {

    void save(Claim claim);

    void delete(Claim claim);

    public boolean findMatches(Long idBilet, List<Claim> storage);

    public Claim getClaimByIndex(int index);

    public int getSize();
}
