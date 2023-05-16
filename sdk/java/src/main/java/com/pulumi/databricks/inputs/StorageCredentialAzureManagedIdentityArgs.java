// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StorageCredentialAzureManagedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageCredentialAzureManagedIdentityArgs Empty = new StorageCredentialAzureManagedIdentityArgs();

    /**
     * The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
     * 
     * `azure_service_principal` optional configuration block to use service principal as credential details for Azure:
     * 
     */
    @Import(name="accessConnectorId", required=true)
    private Output<String> accessConnectorId;

    /**
     * @return The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
     * 
     * `azure_service_principal` optional configuration block to use service principal as credential details for Azure:
     * 
     */
    public Output<String> accessConnectorId() {
        return this.accessConnectorId;
    }

    private StorageCredentialAzureManagedIdentityArgs() {}

    private StorageCredentialAzureManagedIdentityArgs(StorageCredentialAzureManagedIdentityArgs $) {
        this.accessConnectorId = $.accessConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCredentialAzureManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCredentialAzureManagedIdentityArgs $;

        public Builder() {
            $ = new StorageCredentialAzureManagedIdentityArgs();
        }

        public Builder(StorageCredentialAzureManagedIdentityArgs defaults) {
            $ = new StorageCredentialAzureManagedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConnectorId The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
         * 
         * `azure_service_principal` optional configuration block to use service principal as credential details for Azure:
         * 
         * @return builder
         * 
         */
        public Builder accessConnectorId(Output<String> accessConnectorId) {
            $.accessConnectorId = accessConnectorId;
            return this;
        }

        /**
         * @param accessConnectorId The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
         * 
         * `azure_service_principal` optional configuration block to use service principal as credential details for Azure:
         * 
         * @return builder
         * 
         */
        public Builder accessConnectorId(String accessConnectorId) {
            return accessConnectorId(Output.of(accessConnectorId));
        }

        public StorageCredentialAzureManagedIdentityArgs build() {
            $.accessConnectorId = Objects.requireNonNull($.accessConnectorId, "expected parameter 'accessConnectorId' to be non-null");
            return $;
        }
    }

}
