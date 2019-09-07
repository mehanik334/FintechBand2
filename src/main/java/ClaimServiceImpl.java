import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClaimServiceImpl implements ClaimService {

    private ClaimRepository claimRepository = new ClaimRepositoryImpl();

    @Override
    public void sortRepositoryByDate(List<Claim> storage) {
        Collections.sort(storage, new Comparator<Claim>() {
            @Override
            public int compare(Claim o1, Claim o2) {
                return o1.getDateDeparture().toString().compareTo(o2.getDateDeparture().toString());
            }
        });
    }

    @Override
    public List<Claim> getAllClaimByIdClient(Long idClient) {
        List<Claim> findClaim = new ArrayList<>();
        for (int i = 0; i < claimRepository.getSize(); i++) {
            if (idClient.equals(claimRepository.getClaimByIndex(i).getIdClient()))
                findClaim.add(claimRepository.getClaimByIndex(i));
        }
        return findClaim;
    }
}
