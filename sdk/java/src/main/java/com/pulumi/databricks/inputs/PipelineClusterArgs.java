// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.PipelineClusterAutoscaleArgs;
import com.pulumi.databricks.inputs.PipelineClusterAwsAttributesArgs;
import com.pulumi.databricks.inputs.PipelineClusterAzureAttributesArgs;
import com.pulumi.databricks.inputs.PipelineClusterClusterLogConfArgs;
import com.pulumi.databricks.inputs.PipelineClusterGcpAttributesArgs;
import com.pulumi.databricks.inputs.PipelineClusterInitScriptArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineClusterArgs Empty = new PipelineClusterArgs();

    @Import(name="applyPolicyDefaultValues")
    private @Nullable Output<Boolean> applyPolicyDefaultValues;

    public Optional<Output<Boolean>> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }

    @Import(name="autoscale")
    private @Nullable Output<PipelineClusterAutoscaleArgs> autoscale;

    public Optional<Output<PipelineClusterAutoscaleArgs>> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }

    @Import(name="awsAttributes")
    private @Nullable Output<PipelineClusterAwsAttributesArgs> awsAttributes;

    public Optional<Output<PipelineClusterAwsAttributesArgs>> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }

    @Import(name="azureAttributes")
    private @Nullable Output<PipelineClusterAzureAttributesArgs> azureAttributes;

    public Optional<Output<PipelineClusterAzureAttributesArgs>> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }

    @Import(name="clusterLogConf")
    private @Nullable Output<PipelineClusterClusterLogConfArgs> clusterLogConf;

    public Optional<Output<PipelineClusterClusterLogConfArgs>> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }

    @Import(name="customTags")
    private @Nullable Output<Map<String,Object>> customTags;

    public Optional<Output<Map<String,Object>>> customTags() {
        return Optional.ofNullable(this.customTags);
    }

    @Import(name="driverInstancePoolId")
    private @Nullable Output<String> driverInstancePoolId;

    public Optional<Output<String>> driverInstancePoolId() {
        return Optional.ofNullable(this.driverInstancePoolId);
    }

    @Import(name="driverNodeTypeId")
    private @Nullable Output<String> driverNodeTypeId;

    public Optional<Output<String>> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }

    @Import(name="enableLocalDiskEncryption")
    private @Nullable Output<Boolean> enableLocalDiskEncryption;

    public Optional<Output<Boolean>> enableLocalDiskEncryption() {
        return Optional.ofNullable(this.enableLocalDiskEncryption);
    }

    @Import(name="gcpAttributes")
    private @Nullable Output<PipelineClusterGcpAttributesArgs> gcpAttributes;

    public Optional<Output<PipelineClusterGcpAttributesArgs>> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }

    @Import(name="initScripts")
    private @Nullable Output<List<PipelineClusterInitScriptArgs>> initScripts;

    public Optional<Output<List<PipelineClusterInitScriptArgs>>> initScripts() {
        return Optional.ofNullable(this.initScripts);
    }

    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="nodeTypeId")
    private @Nullable Output<String> nodeTypeId;

    public Optional<Output<String>> nodeTypeId() {
        return Optional.ofNullable(this.nodeTypeId);
    }

    @Import(name="numWorkers")
    private @Nullable Output<Integer> numWorkers;

    public Optional<Output<Integer>> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }

    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    @Import(name="sparkConf")
    private @Nullable Output<Map<String,Object>> sparkConf;

    public Optional<Output<Map<String,Object>>> sparkConf() {
        return Optional.ofNullable(this.sparkConf);
    }

    @Import(name="sparkEnvVars")
    private @Nullable Output<Map<String,Object>> sparkEnvVars;

    public Optional<Output<Map<String,Object>>> sparkEnvVars() {
        return Optional.ofNullable(this.sparkEnvVars);
    }

    @Import(name="sshPublicKeys")
    private @Nullable Output<List<String>> sshPublicKeys;

    public Optional<Output<List<String>>> sshPublicKeys() {
        return Optional.ofNullable(this.sshPublicKeys);
    }

    private PipelineClusterArgs() {}

    private PipelineClusterArgs(PipelineClusterArgs $) {
        this.applyPolicyDefaultValues = $.applyPolicyDefaultValues;
        this.autoscale = $.autoscale;
        this.awsAttributes = $.awsAttributes;
        this.azureAttributes = $.azureAttributes;
        this.clusterLogConf = $.clusterLogConf;
        this.customTags = $.customTags;
        this.driverInstancePoolId = $.driverInstancePoolId;
        this.driverNodeTypeId = $.driverNodeTypeId;
        this.enableLocalDiskEncryption = $.enableLocalDiskEncryption;
        this.gcpAttributes = $.gcpAttributes;
        this.initScripts = $.initScripts;
        this.instancePoolId = $.instancePoolId;
        this.label = $.label;
        this.nodeTypeId = $.nodeTypeId;
        this.numWorkers = $.numWorkers;
        this.policyId = $.policyId;
        this.sparkConf = $.sparkConf;
        this.sparkEnvVars = $.sparkEnvVars;
        this.sshPublicKeys = $.sshPublicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineClusterArgs $;

        public Builder() {
            $ = new PipelineClusterArgs();
        }

        public Builder(PipelineClusterArgs defaults) {
            $ = new PipelineClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyPolicyDefaultValues(@Nullable Output<Boolean> applyPolicyDefaultValues) {
            $.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }

        public Builder applyPolicyDefaultValues(Boolean applyPolicyDefaultValues) {
            return applyPolicyDefaultValues(Output.of(applyPolicyDefaultValues));
        }

        public Builder autoscale(@Nullable Output<PipelineClusterAutoscaleArgs> autoscale) {
            $.autoscale = autoscale;
            return this;
        }

        public Builder autoscale(PipelineClusterAutoscaleArgs autoscale) {
            return autoscale(Output.of(autoscale));
        }

        public Builder awsAttributes(@Nullable Output<PipelineClusterAwsAttributesArgs> awsAttributes) {
            $.awsAttributes = awsAttributes;
            return this;
        }

        public Builder awsAttributes(PipelineClusterAwsAttributesArgs awsAttributes) {
            return awsAttributes(Output.of(awsAttributes));
        }

        public Builder azureAttributes(@Nullable Output<PipelineClusterAzureAttributesArgs> azureAttributes) {
            $.azureAttributes = azureAttributes;
            return this;
        }

        public Builder azureAttributes(PipelineClusterAzureAttributesArgs azureAttributes) {
            return azureAttributes(Output.of(azureAttributes));
        }

        public Builder clusterLogConf(@Nullable Output<PipelineClusterClusterLogConfArgs> clusterLogConf) {
            $.clusterLogConf = clusterLogConf;
            return this;
        }

        public Builder clusterLogConf(PipelineClusterClusterLogConfArgs clusterLogConf) {
            return clusterLogConf(Output.of(clusterLogConf));
        }

        public Builder customTags(@Nullable Output<Map<String,Object>> customTags) {
            $.customTags = customTags;
            return this;
        }

        public Builder customTags(Map<String,Object> customTags) {
            return customTags(Output.of(customTags));
        }

        public Builder driverInstancePoolId(@Nullable Output<String> driverInstancePoolId) {
            $.driverInstancePoolId = driverInstancePoolId;
            return this;
        }

        public Builder driverInstancePoolId(String driverInstancePoolId) {
            return driverInstancePoolId(Output.of(driverInstancePoolId));
        }

        public Builder driverNodeTypeId(@Nullable Output<String> driverNodeTypeId) {
            $.driverNodeTypeId = driverNodeTypeId;
            return this;
        }

        public Builder driverNodeTypeId(String driverNodeTypeId) {
            return driverNodeTypeId(Output.of(driverNodeTypeId));
        }

        public Builder enableLocalDiskEncryption(@Nullable Output<Boolean> enableLocalDiskEncryption) {
            $.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }

        public Builder enableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
            return enableLocalDiskEncryption(Output.of(enableLocalDiskEncryption));
        }

        public Builder gcpAttributes(@Nullable Output<PipelineClusterGcpAttributesArgs> gcpAttributes) {
            $.gcpAttributes = gcpAttributes;
            return this;
        }

        public Builder gcpAttributes(PipelineClusterGcpAttributesArgs gcpAttributes) {
            return gcpAttributes(Output.of(gcpAttributes));
        }

        public Builder initScripts(@Nullable Output<List<PipelineClusterInitScriptArgs>> initScripts) {
            $.initScripts = initScripts;
            return this;
        }

        public Builder initScripts(List<PipelineClusterInitScriptArgs> initScripts) {
            return initScripts(Output.of(initScripts));
        }

        public Builder initScripts(PipelineClusterInitScriptArgs... initScripts) {
            return initScripts(List.of(initScripts));
        }

        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder nodeTypeId(@Nullable Output<String> nodeTypeId) {
            $.nodeTypeId = nodeTypeId;
            return this;
        }

        public Builder nodeTypeId(String nodeTypeId) {
            return nodeTypeId(Output.of(nodeTypeId));
        }

        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        public Builder numWorkers(Integer numWorkers) {
            return numWorkers(Output.of(numWorkers));
        }

        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public Builder sparkConf(@Nullable Output<Map<String,Object>> sparkConf) {
            $.sparkConf = sparkConf;
            return this;
        }

        public Builder sparkConf(Map<String,Object> sparkConf) {
            return sparkConf(Output.of(sparkConf));
        }

        public Builder sparkEnvVars(@Nullable Output<Map<String,Object>> sparkEnvVars) {
            $.sparkEnvVars = sparkEnvVars;
            return this;
        }

        public Builder sparkEnvVars(Map<String,Object> sparkEnvVars) {
            return sparkEnvVars(Output.of(sparkEnvVars));
        }

        public Builder sshPublicKeys(@Nullable Output<List<String>> sshPublicKeys) {
            $.sshPublicKeys = sshPublicKeys;
            return this;
        }

        public Builder sshPublicKeys(List<String> sshPublicKeys) {
            return sshPublicKeys(Output.of(sshPublicKeys));
        }

        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }

        public PipelineClusterArgs build() {
            return $;
        }
    }

}
