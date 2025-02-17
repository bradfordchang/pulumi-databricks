// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs Empty = new InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs();

    @Import(name="allocationStrategy", required=true)
    private Output<String> allocationStrategy;

    public Output<String> allocationStrategy() {
        return this.allocationStrategy;
    }

    @Import(name="instancePoolsToUseCount")
    private @Nullable Output<Integer> instancePoolsToUseCount;

    public Optional<Output<Integer>> instancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }

    private InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs() {}

    private InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs(InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs $) {
        this.allocationStrategy = $.allocationStrategy;
        this.instancePoolsToUseCount = $.instancePoolsToUseCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs $;

        public Builder() {
            $ = new InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs();
        }

        public Builder(InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs defaults) {
            $ = new InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder allocationStrategy(Output<String> allocationStrategy) {
            $.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(String allocationStrategy) {
            return allocationStrategy(Output.of(allocationStrategy));
        }

        public Builder instancePoolsToUseCount(@Nullable Output<Integer> instancePoolsToUseCount) {
            $.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder instancePoolsToUseCount(Integer instancePoolsToUseCount) {
            return instancePoolsToUseCount(Output.of(instancePoolsToUseCount));
        }

        public InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionArgs build() {
            $.allocationStrategy = Objects.requireNonNull($.allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
            return $;
        }
    }

}
