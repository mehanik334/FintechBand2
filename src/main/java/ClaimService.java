import java.util.List;
import java.util.Map;

public interface ClaimService {

    public void sortRepositoryByDate(List<Claim> storage);

    public List<Claim> getAllClaimByIdClient(Long idClient);
}
