// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes Empty = new GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes();

    @Import(name="availability")
    private @Nullable String availability;

    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }

    @Import(name="ebsVolumeCount")
    private @Nullable Integer ebsVolumeCount;

    public Optional<Integer> ebsVolumeCount() {
        return Optional.ofNullable(this.ebsVolumeCount);
    }

    @Import(name="ebsVolumeSize")
    private @Nullable Integer ebsVolumeSize;

    public Optional<Integer> ebsVolumeSize() {
        return Optional.ofNullable(this.ebsVolumeSize);
    }

    @Import(name="ebsVolumeType")
    private @Nullable String ebsVolumeType;

    public Optional<String> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }

    @Import(name="firstOnDemand")
    private @Nullable Integer firstOnDemand;

    public Optional<Integer> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }

    @Import(name="instanceProfileArn")
    private @Nullable String instanceProfileArn;

    public Optional<String> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }

    @Import(name="spotBidPricePercent")
    private @Nullable Integer spotBidPricePercent;

    public Optional<Integer> spotBidPricePercent() {
        return Optional.ofNullable(this.spotBidPricePercent);
    }

    @Import(name="zoneId")
    private @Nullable String zoneId;

    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes(GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes $) {
        this.availability = $.availability;
        this.ebsVolumeCount = $.ebsVolumeCount;
        this.ebsVolumeSize = $.ebsVolumeSize;
        this.ebsVolumeType = $.ebsVolumeType;
        this.firstOnDemand = $.firstOnDemand;
        this.instanceProfileArn = $.instanceProfileArn;
        this.spotBidPricePercent = $.spotBidPricePercent;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes(Objects.requireNonNull(defaults));
        }

        public Builder availability(@Nullable String availability) {
            $.availability = availability;
            return this;
        }

        public Builder ebsVolumeCount(@Nullable Integer ebsVolumeCount) {
            $.ebsVolumeCount = ebsVolumeCount;
            return this;
        }

        public Builder ebsVolumeSize(@Nullable Integer ebsVolumeSize) {
            $.ebsVolumeSize = ebsVolumeSize;
            return this;
        }

        public Builder ebsVolumeType(@Nullable String ebsVolumeType) {
            $.ebsVolumeType = ebsVolumeType;
            return this;
        }

        public Builder firstOnDemand(@Nullable Integer firstOnDemand) {
            $.firstOnDemand = firstOnDemand;
            return this;
        }

        public Builder instanceProfileArn(@Nullable String instanceProfileArn) {
            $.instanceProfileArn = instanceProfileArn;
            return this;
        }

        public Builder spotBidPricePercent(@Nullable Integer spotBidPricePercent) {
            $.spotBidPricePercent = spotBidPricePercent;
            return this;
        }

        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributes build() {
            return $;
        }
    }

}
