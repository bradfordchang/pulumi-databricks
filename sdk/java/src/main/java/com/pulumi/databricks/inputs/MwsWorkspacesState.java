// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsWorkspacesCloudResourceContainerArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesExternalCustomerInfoArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesGcpManagedNetworkConfigArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesGkeConfigArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesTokenArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsWorkspacesState extends com.pulumi.resources.ResourceArgs {

    public static final MwsWorkspacesState Empty = new MwsWorkspacesState();

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * region of VPC.
     * 
     */
    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    /**
     * @return region of VPC.
     * 
     */
    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * A block that specifies GCP workspace configurations, consisting of following blocks:
     * 
     */
    @Import(name="cloudResourceContainer")
    private @Nullable Output<MwsWorkspacesCloudResourceContainerArgs> cloudResourceContainer;

    /**
     * @return A block that specifies GCP workspace configurations, consisting of following blocks:
     * 
     */
    public Optional<Output<MwsWorkspacesCloudResourceContainerArgs>> cloudResourceContainer() {
        return Optional.ofNullable(this.cloudResourceContainer);
    }

    /**
     * (Integer) time when workspace was created
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    /**
     * @return (Integer) time when workspace was created
     * 
     */
    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    @Import(name="credentialsId")
    private @Nullable Output<String> credentialsId;

    public Optional<Output<String>> credentialsId() {
        return Optional.ofNullable(this.credentialsId);
    }

    /**
     * @deprecated
     * Use managed_services_customer_managed_key_id instead
     * 
     */
    @Deprecated /* Use managed_services_customer_managed_key_id instead */
    @Import(name="customerManagedKeyId")
    private @Nullable Output<String> customerManagedKeyId;

    /**
     * @deprecated
     * Use managed_services_customer_managed_key_id instead
     * 
     */
    @Deprecated /* Use managed_services_customer_managed_key_id instead */
    public Optional<Output<String>> customerManagedKeyId() {
        return Optional.ofNullable(this.customerManagedKeyId);
    }

    /**
     * part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    @Import(name="deploymentName")
    private @Nullable Output<String> deploymentName;

    /**
     * @return part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    public Optional<Output<String>> deploymentName() {
        return Optional.ofNullable(this.deploymentName);
    }

    @Import(name="externalCustomerInfo")
    private @Nullable Output<MwsWorkspacesExternalCustomerInfoArgs> externalCustomerInfo;

    public Optional<Output<MwsWorkspacesExternalCustomerInfoArgs>> externalCustomerInfo() {
        return Optional.ofNullable(this.externalCustomerInfo);
    }

    @Import(name="gcpManagedNetworkConfig")
    private @Nullable Output<MwsWorkspacesGcpManagedNetworkConfigArgs> gcpManagedNetworkConfig;

    public Optional<Output<MwsWorkspacesGcpManagedNetworkConfigArgs>> gcpManagedNetworkConfig() {
        return Optional.ofNullable(this.gcpManagedNetworkConfig);
    }

    /**
     * A block that specifies GKE configuration for the Databricks workspace:
     * 
     */
    @Import(name="gkeConfig")
    private @Nullable Output<MwsWorkspacesGkeConfigArgs> gkeConfig;

    /**
     * @return A block that specifies GKE configuration for the Databricks workspace:
     * 
     */
    public Optional<Output<MwsWorkspacesGkeConfigArgs>> gkeConfig() {
        return Optional.ofNullable(this.gkeConfig);
    }

    @Import(name="isNoPublicIpEnabled")
    private @Nullable Output<Boolean> isNoPublicIpEnabled;

    public Optional<Output<Boolean>> isNoPublicIpEnabled() {
        return Optional.ofNullable(this.isNoPublicIpEnabled);
    }

    /**
     * region of the subnet.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return region of the subnet.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    @Import(name="managedServicesCustomerManagedKeyId")
    private @Nullable Output<String> managedServicesCustomerManagedKeyId;

    /**
     * @return `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    public Optional<Output<String>> managedServicesCustomerManagedKeyId() {
        return Optional.ofNullable(this.managedServicesCustomerManagedKeyId);
    }

    /**
     * `network_id` from networks.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return `network_id` from networks.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    @Import(name="pricingTier")
    private @Nullable Output<String> pricingTier;

    public Optional<Output<String>> pricingTier() {
        return Optional.ofNullable(this.pricingTier);
    }

    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     * 
     */
    @Import(name="privateAccessSettingsId")
    private @Nullable Output<String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     * 
     */
    public Optional<Output<String>> privateAccessSettingsId() {
        return Optional.ofNullable(this.privateAccessSettingsId);
    }

    /**
     * `storage_configuration_id` from storage configuration.
     * 
     */
    @Import(name="storageConfigurationId")
    private @Nullable Output<String> storageConfigurationId;

    /**
     * @return `storage_configuration_id` from storage configuration.
     * 
     */
    public Optional<Output<String>> storageConfigurationId() {
        return Optional.ofNullable(this.storageConfigurationId);
    }

    /**
     * `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
     * 
     */
    @Import(name="storageCustomerManagedKeyId")
    private @Nullable Output<String> storageCustomerManagedKeyId;

    /**
     * @return `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
     * 
     */
    public Optional<Output<String>> storageCustomerManagedKeyId() {
        return Optional.ofNullable(this.storageCustomerManagedKeyId);
    }

    @Import(name="token")
    private @Nullable Output<MwsWorkspacesTokenArgs> token;

    public Optional<Output<MwsWorkspacesTokenArgs>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * (String) workspace id
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<Integer> workspaceId;

    /**
     * @return (String) workspace id
     * 
     */
    public Optional<Output<Integer>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    /**
     * name of the workspace, will appear on UI.
     * 
     */
    @Import(name="workspaceName")
    private @Nullable Output<String> workspaceName;

    /**
     * @return name of the workspace, will appear on UI.
     * 
     */
    public Optional<Output<String>> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    /**
     * (String) workspace status
     * 
     */
    @Import(name="workspaceStatus")
    private @Nullable Output<String> workspaceStatus;

    /**
     * @return (String) workspace status
     * 
     */
    public Optional<Output<String>> workspaceStatus() {
        return Optional.ofNullable(this.workspaceStatus);
    }

    /**
     * (String) updates on workspace status
     * 
     */
    @Import(name="workspaceStatusMessage")
    private @Nullable Output<String> workspaceStatusMessage;

    /**
     * @return (String) updates on workspace status
     * 
     */
    public Optional<Output<String>> workspaceStatusMessage() {
        return Optional.ofNullable(this.workspaceStatusMessage);
    }

    /**
     * (String) URL of the workspace
     * 
     */
    @Import(name="workspaceUrl")
    private @Nullable Output<String> workspaceUrl;

    /**
     * @return (String) URL of the workspace
     * 
     */
    public Optional<Output<String>> workspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    private MwsWorkspacesState() {}

    private MwsWorkspacesState(MwsWorkspacesState $) {
        this.accountId = $.accountId;
        this.awsRegion = $.awsRegion;
        this.cloud = $.cloud;
        this.cloudResourceContainer = $.cloudResourceContainer;
        this.creationTime = $.creationTime;
        this.credentialsId = $.credentialsId;
        this.customerManagedKeyId = $.customerManagedKeyId;
        this.deploymentName = $.deploymentName;
        this.externalCustomerInfo = $.externalCustomerInfo;
        this.gcpManagedNetworkConfig = $.gcpManagedNetworkConfig;
        this.gkeConfig = $.gkeConfig;
        this.isNoPublicIpEnabled = $.isNoPublicIpEnabled;
        this.location = $.location;
        this.managedServicesCustomerManagedKeyId = $.managedServicesCustomerManagedKeyId;
        this.networkId = $.networkId;
        this.pricingTier = $.pricingTier;
        this.privateAccessSettingsId = $.privateAccessSettingsId;
        this.storageConfigurationId = $.storageConfigurationId;
        this.storageCustomerManagedKeyId = $.storageCustomerManagedKeyId;
        this.token = $.token;
        this.workspaceId = $.workspaceId;
        this.workspaceName = $.workspaceName;
        this.workspaceStatus = $.workspaceStatus;
        this.workspaceStatusMessage = $.workspaceStatusMessage;
        this.workspaceUrl = $.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsWorkspacesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesState $;

        public Builder() {
            $ = new MwsWorkspacesState();
        }

        public Builder(MwsWorkspacesState defaults) {
            $ = new MwsWorkspacesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param awsRegion region of VPC.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion region of VPC.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param cloudResourceContainer A block that specifies GCP workspace configurations, consisting of following blocks:
         * 
         * @return builder
         * 
         */
        public Builder cloudResourceContainer(@Nullable Output<MwsWorkspacesCloudResourceContainerArgs> cloudResourceContainer) {
            $.cloudResourceContainer = cloudResourceContainer;
            return this;
        }

        /**
         * @param cloudResourceContainer A block that specifies GCP workspace configurations, consisting of following blocks:
         * 
         * @return builder
         * 
         */
        public Builder cloudResourceContainer(MwsWorkspacesCloudResourceContainerArgs cloudResourceContainer) {
            return cloudResourceContainer(Output.of(cloudResourceContainer));
        }

        /**
         * @param creationTime (Integer) time when workspace was created
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime (Integer) time when workspace was created
         * 
         * @return builder
         * 
         */
        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        public Builder credentialsId(@Nullable Output<String> credentialsId) {
            $.credentialsId = credentialsId;
            return this;
        }

        public Builder credentialsId(String credentialsId) {
            return credentialsId(Output.of(credentialsId));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use managed_services_customer_managed_key_id instead
         * 
         */
        @Deprecated /* Use managed_services_customer_managed_key_id instead */
        public Builder customerManagedKeyId(@Nullable Output<String> customerManagedKeyId) {
            $.customerManagedKeyId = customerManagedKeyId;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use managed_services_customer_managed_key_id instead
         * 
         */
        @Deprecated /* Use managed_services_customer_managed_key_id instead */
        public Builder customerManagedKeyId(String customerManagedKeyId) {
            return customerManagedKeyId(Output.of(customerManagedKeyId));
        }

        /**
         * @param deploymentName part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param deploymentName part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            return deploymentName(Output.of(deploymentName));
        }

        public Builder externalCustomerInfo(@Nullable Output<MwsWorkspacesExternalCustomerInfoArgs> externalCustomerInfo) {
            $.externalCustomerInfo = externalCustomerInfo;
            return this;
        }

        public Builder externalCustomerInfo(MwsWorkspacesExternalCustomerInfoArgs externalCustomerInfo) {
            return externalCustomerInfo(Output.of(externalCustomerInfo));
        }

        public Builder gcpManagedNetworkConfig(@Nullable Output<MwsWorkspacesGcpManagedNetworkConfigArgs> gcpManagedNetworkConfig) {
            $.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
            return this;
        }

        public Builder gcpManagedNetworkConfig(MwsWorkspacesGcpManagedNetworkConfigArgs gcpManagedNetworkConfig) {
            return gcpManagedNetworkConfig(Output.of(gcpManagedNetworkConfig));
        }

        /**
         * @param gkeConfig A block that specifies GKE configuration for the Databricks workspace:
         * 
         * @return builder
         * 
         */
        public Builder gkeConfig(@Nullable Output<MwsWorkspacesGkeConfigArgs> gkeConfig) {
            $.gkeConfig = gkeConfig;
            return this;
        }

        /**
         * @param gkeConfig A block that specifies GKE configuration for the Databricks workspace:
         * 
         * @return builder
         * 
         */
        public Builder gkeConfig(MwsWorkspacesGkeConfigArgs gkeConfig) {
            return gkeConfig(Output.of(gkeConfig));
        }

        public Builder isNoPublicIpEnabled(@Nullable Output<Boolean> isNoPublicIpEnabled) {
            $.isNoPublicIpEnabled = isNoPublicIpEnabled;
            return this;
        }

        public Builder isNoPublicIpEnabled(Boolean isNoPublicIpEnabled) {
            return isNoPublicIpEnabled(Output.of(isNoPublicIpEnabled));
        }

        /**
         * @param location region of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location region of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedServicesCustomerManagedKeyId `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
         * 
         * @return builder
         * 
         */
        public Builder managedServicesCustomerManagedKeyId(@Nullable Output<String> managedServicesCustomerManagedKeyId) {
            $.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
            return this;
        }

        /**
         * @param managedServicesCustomerManagedKeyId `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
         * 
         * @return builder
         * 
         */
        public Builder managedServicesCustomerManagedKeyId(String managedServicesCustomerManagedKeyId) {
            return managedServicesCustomerManagedKeyId(Output.of(managedServicesCustomerManagedKeyId));
        }

        /**
         * @param networkId `network_id` from networks.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId `network_id` from networks.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public Builder pricingTier(@Nullable Output<String> pricingTier) {
            $.pricingTier = pricingTier;
            return this;
        }

        public Builder pricingTier(String pricingTier) {
            return pricingTier(Output.of(pricingTier));
        }

        /**
         * @param privateAccessSettingsId Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsId(@Nullable Output<String> privateAccessSettingsId) {
            $.privateAccessSettingsId = privateAccessSettingsId;
            return this;
        }

        /**
         * @param privateAccessSettingsId Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsId(String privateAccessSettingsId) {
            return privateAccessSettingsId(Output.of(privateAccessSettingsId));
        }

        /**
         * @param storageConfigurationId `storage_configuration_id` from storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationId(@Nullable Output<String> storageConfigurationId) {
            $.storageConfigurationId = storageConfigurationId;
            return this;
        }

        /**
         * @param storageConfigurationId `storage_configuration_id` from storage configuration.
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationId(String storageConfigurationId) {
            return storageConfigurationId(Output.of(storageConfigurationId));
        }

        /**
         * @param storageCustomerManagedKeyId `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
         * 
         * @return builder
         * 
         */
        public Builder storageCustomerManagedKeyId(@Nullable Output<String> storageCustomerManagedKeyId) {
            $.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
            return this;
        }

        /**
         * @param storageCustomerManagedKeyId `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
         * 
         * @return builder
         * 
         */
        public Builder storageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
            return storageCustomerManagedKeyId(Output.of(storageCustomerManagedKeyId));
        }

        public Builder token(@Nullable Output<MwsWorkspacesTokenArgs> token) {
            $.token = token;
            return this;
        }

        public Builder token(MwsWorkspacesTokenArgs token) {
            return token(Output.of(token));
        }

        /**
         * @param workspaceId (String) workspace id
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<Integer> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId (String) workspace id
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Integer workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        /**
         * @param workspaceName name of the workspace, will appear on UI.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName name of the workspace, will appear on UI.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        /**
         * @param workspaceStatus (String) workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatus(@Nullable Output<String> workspaceStatus) {
            $.workspaceStatus = workspaceStatus;
            return this;
        }

        /**
         * @param workspaceStatus (String) workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatus(String workspaceStatus) {
            return workspaceStatus(Output.of(workspaceStatus));
        }

        /**
         * @param workspaceStatusMessage (String) updates on workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatusMessage(@Nullable Output<String> workspaceStatusMessage) {
            $.workspaceStatusMessage = workspaceStatusMessage;
            return this;
        }

        /**
         * @param workspaceStatusMessage (String) updates on workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatusMessage(String workspaceStatusMessage) {
            return workspaceStatusMessage(Output.of(workspaceStatusMessage));
        }

        /**
         * @param workspaceUrl (String) URL of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(@Nullable Output<String> workspaceUrl) {
            $.workspaceUrl = workspaceUrl;
            return this;
        }

        /**
         * @param workspaceUrl (String) URL of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(String workspaceUrl) {
            return workspaceUrl(Output.of(workspaceUrl));
        }

        public MwsWorkspacesState build() {
            return $;
        }
    }

}
