import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClaimRepositoryImpl implements ClaimRepository {

    private List<Claim> storageClaim = new ArrayList<>();

    public ClaimRepositoryImpl() {
    }

    @Override
    public void save(Claim claim) {
        try {
            if (!findMatches(claim.getIdBilet(), storageClaim)) {
                this.storageClaim.add(claim);
                claim.setStatus("Claim done");
            } else {
                System.out.println("Double claim");
            }
        }catch (Exception e) {
            claim.setStatus("started process");
            storageClaim.add(claim);
        }

    }

    @Override
    public void delete(Claim claim) {
        this.storageClaim.remove(claim);
    }

    @Override
    public boolean findMatches(Long idBilet, List<Claim> storage) {
        boolean b = false;
        if (storage != null) {
            for (int i = 0; i < storage.size(); i++) {
                if (storage.get(i).getIdBilet().equals(idBilet)) {
                    b = true;
                }
            }
        }
        return b;
    }

    @Override
    public Claim getClaimByIndex(int index) {
        return storageClaim.get(index);
    }

    public int getSize() {
        return storageClaim.size();
    }
}
