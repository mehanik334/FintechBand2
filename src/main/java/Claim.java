import java.util.Date;
import java.util.Objects;

public class Claim {

    private Date dateDeparture;
    private Long idClient;
    private Long idBilet;
    private String status;

    public Claim() {
    }

    public Claim(Date dateDeparture, Long idClient, Long idBilet, String status) {
        this.dateDeparture = dateDeparture;
        this.idClient = idClient;
        this.idBilet = idBilet;
        this.status = status;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdBilet() {
        return idBilet;
    }

    public void setIdBilet(Long idBilet) {
        this.idBilet = idBilet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Claim)) return false;
        Claim claim = (Claim) o;
        return Objects.equals(getDateDeparture(), claim.getDateDeparture()) &&
                Objects.equals(getIdClient(), claim.getIdClient()) &&
                Objects.equals(getIdBilet(), claim.getIdBilet()) &&
                Objects.equals(getStatus(), claim.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDateDeparture(), getIdClient(), getIdBilet(), getStatus());
    }

    @Override
    public String toString() {
        return "Claim{" +
                "dateDeparture=" + dateDeparture +
                ", idClient=" + idClient +
                ", idBilet=" + idBilet +
                ", status='" + status + '\'' +
                '}';
    }
}

