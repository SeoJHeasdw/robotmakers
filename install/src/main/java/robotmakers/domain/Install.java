package robotmakers.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import robotmakers.InstallApplication;
import robotmakers.domain.InstallStarted;

@Entity
@Table(name = "Install_table")
@Data
//<<< DDD / Aggregate Root
public class Install {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String robotName;

    private Integer qty;

    private Long orderId;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        InstallStarted installStarted = new InstallStarted(this);
        installStarted.publishAfterCommit();
    }

    public static InstallRepository repository() {
        InstallRepository installRepository = InstallApplication.applicationContext.getBean(
            InstallRepository.class
        );
        return installRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startInstall(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Install install = new Install();
        repository().save(install);

        InstallStarted installStarted = new InstallStarted(install);
        installStarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(install->{
            
            install // do something
            repository().save(install);

            InstallStarted installStarted = new InstallStarted(install);
            installStarted.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
