// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreDataAccessDatabricksGcpServiceAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreDataAccessDatabricksGcpServiceAccountArgs Empty = new MetastoreDataAccessDatabricksGcpServiceAccountArgs();

    @Import(name="credentialId")
    private @Nullable Output<String> credentialId;

    public Optional<Output<String>> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     * `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     * `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    private MetastoreDataAccessDatabricksGcpServiceAccountArgs() {}

    private MetastoreDataAccessDatabricksGcpServiceAccountArgs(MetastoreDataAccessDatabricksGcpServiceAccountArgs $) {
        this.credentialId = $.credentialId;
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreDataAccessDatabricksGcpServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreDataAccessDatabricksGcpServiceAccountArgs $;

        public Builder() {
            $ = new MetastoreDataAccessDatabricksGcpServiceAccountArgs();
        }

        public Builder(MetastoreDataAccessDatabricksGcpServiceAccountArgs defaults) {
            $ = new MetastoreDataAccessDatabricksGcpServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentialId(@Nullable Output<String> credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        public Builder credentialId(String credentialId) {
            return credentialId(Output.of(credentialId));
        }

        /**
         * @param email The email of the GCP service account created, to be granted access to relevant buckets.
         * 
         * `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email of the GCP service account created, to be granted access to relevant buckets.
         * 
         * `azure_service_principal` optional configuration block for credential details for Azure (Legacy):
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public MetastoreDataAccessDatabricksGcpServiceAccountArgs build() {
            return $;
        }
    }

}
