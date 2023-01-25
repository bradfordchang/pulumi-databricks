// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetInstancePoolPoolInfoDiskSpecDiskTypeArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePoolPoolInfoDiskSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstancePoolPoolInfoDiskSpecArgs Empty = new GetInstancePoolPoolInfoDiskSpecArgs();

    @Import(name="diskCount")
    private @Nullable Output<Integer> diskCount;

    public Optional<Output<Integer>> diskCount() {
        return Optional.ofNullable(this.diskCount);
    }

    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    @Import(name="diskType")
    private @Nullable Output<GetInstancePoolPoolInfoDiskSpecDiskTypeArgs> diskType;

    public Optional<Output<GetInstancePoolPoolInfoDiskSpecDiskTypeArgs>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    private GetInstancePoolPoolInfoDiskSpecArgs() {}

    private GetInstancePoolPoolInfoDiskSpecArgs(GetInstancePoolPoolInfoDiskSpecArgs $) {
        this.diskCount = $.diskCount;
        this.diskSize = $.diskSize;
        this.diskType = $.diskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePoolPoolInfoDiskSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePoolPoolInfoDiskSpecArgs $;

        public Builder() {
            $ = new GetInstancePoolPoolInfoDiskSpecArgs();
        }

        public Builder(GetInstancePoolPoolInfoDiskSpecArgs defaults) {
            $ = new GetInstancePoolPoolInfoDiskSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            $.diskCount = diskCount;
            return this;
        }

        public Builder diskCount(Integer diskCount) {
            return diskCount(Output.of(diskCount));
        }

        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        public Builder diskType(@Nullable Output<GetInstancePoolPoolInfoDiskSpecDiskTypeArgs> diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder diskType(GetInstancePoolPoolInfoDiskSpecDiskTypeArgs diskType) {
            return diskType(Output.of(diskType));
        }

        public GetInstancePoolPoolInfoDiskSpecArgs build() {
            return $;
        }
    }

}
