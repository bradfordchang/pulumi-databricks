// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption Empty = new GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption();

    @Import(name="allocationStrategy", required=true)
    private String allocationStrategy;

    public String allocationStrategy() {
        return this.allocationStrategy;
    }

    @Import(name="instancePoolsToUseCount")
    private @Nullable Integer instancePoolsToUseCount;

    public Optional<Integer> instancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }

    private GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption() {}

    private GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption(GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption $) {
        this.allocationStrategy = $.allocationStrategy;
        this.instancePoolsToUseCount = $.instancePoolsToUseCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption $;

        public Builder() {
            $ = new GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption();
        }

        public Builder(GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption defaults) {
            $ = new GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption(Objects.requireNonNull(defaults));
        }

        public Builder allocationStrategy(String allocationStrategy) {
            $.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            $.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption build() {
            $.allocationStrategy = Objects.requireNonNull($.allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
            return $;
        }
    }

}
