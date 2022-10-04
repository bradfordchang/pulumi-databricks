// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClientsArgs;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs Empty = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs();

    @Import(name="clients", required=true)
    private Output<GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClientsArgs> clients;

    public Output<GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClientsArgs> clients() {
        return this.clients;
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs $) {
        this.clients = $.clients;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder clients(Output<GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClientsArgs> clients) {
            $.clients = clients;
            return this;
        }

        public Builder clients(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClientsArgs clients) {
            return clients(Output.of(clients));
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs build() {
            $.clients = Objects.requireNonNull($.clients, "expected parameter 'clients' to be non-null");
            return $;
        }
    }

}
