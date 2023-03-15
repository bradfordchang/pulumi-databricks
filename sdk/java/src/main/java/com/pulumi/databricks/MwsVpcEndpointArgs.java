// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsVpcEndpointGcpVpcEndpointInfoArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsVpcEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsVpcEndpointArgs Empty = new MwsVpcEndpointArgs();

    /**
     * Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * (AWS Only) The ID of the Databricks endpoint service that this VPC endpoint is connected to. Please find the list of endpoint service IDs for each supported region in the [Databricks PrivateLink documentation](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html)
     * 
     */
    @Import(name="awsEndpointServiceId")
    private @Nullable Output<String> awsEndpointServiceId;

    /**
     * @return (AWS Only) The ID of the Databricks endpoint service that this VPC endpoint is connected to. Please find the list of endpoint service IDs for each supported region in the [Databricks PrivateLink documentation](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html)
     * 
     */
    public Optional<Output<String>> awsEndpointServiceId() {
        return Optional.ofNullable(this.awsEndpointServiceId);
    }

    @Import(name="awsVpcEndpointId")
    private @Nullable Output<String> awsVpcEndpointId;

    public Optional<Output<String>> awsVpcEndpointId() {
        return Optional.ofNullable(this.awsVpcEndpointId);
    }

    /**
     * a block consists of Google Cloud specific information for this PSC endpoint. It has the following fields:
     * 
     */
    @Import(name="gcpVpcEndpointInfo")
    private @Nullable Output<MwsVpcEndpointGcpVpcEndpointInfoArgs> gcpVpcEndpointInfo;

    /**
     * @return a block consists of Google Cloud specific information for this PSC endpoint. It has the following fields:
     * 
     */
    public Optional<Output<MwsVpcEndpointGcpVpcEndpointInfoArgs>> gcpVpcEndpointInfo() {
        return Optional.ofNullable(this.gcpVpcEndpointInfo);
    }

    /**
     * Region of AWS VPC
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region of AWS VPC
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (AWS Only) State of VPC Endpoint
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (AWS Only) State of VPC Endpoint
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="useCase")
    private @Nullable Output<String> useCase;

    public Optional<Output<String>> useCase() {
        return Optional.ofNullable(this.useCase);
    }

    /**
     * Canonical unique identifier of VPC Endpoint in Databricks Account
     * 
     */
    @Import(name="vpcEndpointId")
    private @Nullable Output<String> vpcEndpointId;

    /**
     * @return Canonical unique identifier of VPC Endpoint in Databricks Account
     * 
     */
    public Optional<Output<String>> vpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }

    /**
     * Name of VPC Endpoint in Databricks Account
     * 
     */
    @Import(name="vpcEndpointName", required=true)
    private Output<String> vpcEndpointName;

    /**
     * @return Name of VPC Endpoint in Databricks Account
     * 
     */
    public Output<String> vpcEndpointName() {
        return this.vpcEndpointName;
    }

    private MwsVpcEndpointArgs() {}

    private MwsVpcEndpointArgs(MwsVpcEndpointArgs $) {
        this.accountId = $.accountId;
        this.awsAccountId = $.awsAccountId;
        this.awsEndpointServiceId = $.awsEndpointServiceId;
        this.awsVpcEndpointId = $.awsVpcEndpointId;
        this.gcpVpcEndpointInfo = $.gcpVpcEndpointInfo;
        this.region = $.region;
        this.state = $.state;
        this.useCase = $.useCase;
        this.vpcEndpointId = $.vpcEndpointId;
        this.vpcEndpointName = $.vpcEndpointName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsVpcEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsVpcEndpointArgs $;

        public Builder() {
            $ = new MwsVpcEndpointArgs();
        }

        public Builder(MwsVpcEndpointArgs defaults) {
            $ = new MwsVpcEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param awsEndpointServiceId (AWS Only) The ID of the Databricks endpoint service that this VPC endpoint is connected to. Please find the list of endpoint service IDs for each supported region in the [Databricks PrivateLink documentation](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html)
         * 
         * @return builder
         * 
         */
        public Builder awsEndpointServiceId(@Nullable Output<String> awsEndpointServiceId) {
            $.awsEndpointServiceId = awsEndpointServiceId;
            return this;
        }

        /**
         * @param awsEndpointServiceId (AWS Only) The ID of the Databricks endpoint service that this VPC endpoint is connected to. Please find the list of endpoint service IDs for each supported region in the [Databricks PrivateLink documentation](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html)
         * 
         * @return builder
         * 
         */
        public Builder awsEndpointServiceId(String awsEndpointServiceId) {
            return awsEndpointServiceId(Output.of(awsEndpointServiceId));
        }

        public Builder awsVpcEndpointId(@Nullable Output<String> awsVpcEndpointId) {
            $.awsVpcEndpointId = awsVpcEndpointId;
            return this;
        }

        public Builder awsVpcEndpointId(String awsVpcEndpointId) {
            return awsVpcEndpointId(Output.of(awsVpcEndpointId));
        }

        /**
         * @param gcpVpcEndpointInfo a block consists of Google Cloud specific information for this PSC endpoint. It has the following fields:
         * 
         * @return builder
         * 
         */
        public Builder gcpVpcEndpointInfo(@Nullable Output<MwsVpcEndpointGcpVpcEndpointInfoArgs> gcpVpcEndpointInfo) {
            $.gcpVpcEndpointInfo = gcpVpcEndpointInfo;
            return this;
        }

        /**
         * @param gcpVpcEndpointInfo a block consists of Google Cloud specific information for this PSC endpoint. It has the following fields:
         * 
         * @return builder
         * 
         */
        public Builder gcpVpcEndpointInfo(MwsVpcEndpointGcpVpcEndpointInfoArgs gcpVpcEndpointInfo) {
            return gcpVpcEndpointInfo(Output.of(gcpVpcEndpointInfo));
        }

        /**
         * @param region Region of AWS VPC
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region of AWS VPC
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param state (AWS Only) State of VPC Endpoint
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (AWS Only) State of VPC Endpoint
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder useCase(@Nullable Output<String> useCase) {
            $.useCase = useCase;
            return this;
        }

        public Builder useCase(String useCase) {
            return useCase(Output.of(useCase));
        }

        /**
         * @param vpcEndpointId Canonical unique identifier of VPC Endpoint in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            $.vpcEndpointId = vpcEndpointId;
            return this;
        }

        /**
         * @param vpcEndpointId Canonical unique identifier of VPC Endpoint in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointId(String vpcEndpointId) {
            return vpcEndpointId(Output.of(vpcEndpointId));
        }

        /**
         * @param vpcEndpointName Name of VPC Endpoint in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointName(Output<String> vpcEndpointName) {
            $.vpcEndpointName = vpcEndpointName;
            return this;
        }

        /**
         * @param vpcEndpointName Name of VPC Endpoint in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointName(String vpcEndpointName) {
            return vpcEndpointName(Output.of(vpcEndpointName));
        }

        public MwsVpcEndpointArgs build() {
            $.vpcEndpointName = Objects.requireNonNull($.vpcEndpointName, "expected parameter 'vpcEndpointName' to be non-null");
            return $;
        }
    }

}
