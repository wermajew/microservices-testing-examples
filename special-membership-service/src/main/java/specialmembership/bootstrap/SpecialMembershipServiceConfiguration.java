package specialmembership.bootstrap;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SpecialMembershipServiceConfiguration extends Configuration {

    @URL
    private String creditScoreServiceUrl;

    @NotNull
    @Valid
    private EventPublisherConfiguration eventPublisher;

    public String getCreditScoreServiceUrl() {
        return creditScoreServiceUrl;
    }

    public void setCreditScoreServiceUrl(String creditScoreServiceUrl) {
        this.creditScoreServiceUrl = creditScoreServiceUrl;
    }

    public EventPublisherConfiguration getEventPublisher() {
        return eventPublisher;
    }

    public void setEventPublisher(EventPublisherConfiguration eventPublisher) {
        this.eventPublisher = eventPublisher;
    }
}
