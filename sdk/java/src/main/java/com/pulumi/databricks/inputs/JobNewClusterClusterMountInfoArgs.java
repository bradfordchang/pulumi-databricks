// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobNewClusterClusterMountInfoNetworkFilesystemInfoArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterClusterMountInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterClusterMountInfoArgs Empty = new JobNewClusterClusterMountInfoArgs();

    @Import(name="localMountDirPath", required=true)
    private Output<String> localMountDirPath;

    public Output<String> localMountDirPath() {
        return this.localMountDirPath;
    }

    @Import(name="networkFilesystemInfo", required=true)
    private Output<JobNewClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo;

    public Output<JobNewClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }

    @Import(name="remoteMountDirPath")
    private @Nullable Output<String> remoteMountDirPath;

    public Optional<Output<String>> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    private JobNewClusterClusterMountInfoArgs() {}

    private JobNewClusterClusterMountInfoArgs(JobNewClusterClusterMountInfoArgs $) {
        this.localMountDirPath = $.localMountDirPath;
        this.networkFilesystemInfo = $.networkFilesystemInfo;
        this.remoteMountDirPath = $.remoteMountDirPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterClusterMountInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterClusterMountInfoArgs $;

        public Builder() {
            $ = new JobNewClusterClusterMountInfoArgs();
        }

        public Builder(JobNewClusterClusterMountInfoArgs defaults) {
            $ = new JobNewClusterClusterMountInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder localMountDirPath(Output<String> localMountDirPath) {
            $.localMountDirPath = localMountDirPath;
            return this;
        }

        public Builder localMountDirPath(String localMountDirPath) {
            return localMountDirPath(Output.of(localMountDirPath));
        }

        public Builder networkFilesystemInfo(Output<JobNewClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo) {
            $.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }

        public Builder networkFilesystemInfo(JobNewClusterClusterMountInfoNetworkFilesystemInfoArgs networkFilesystemInfo) {
            return networkFilesystemInfo(Output.of(networkFilesystemInfo));
        }

        public Builder remoteMountDirPath(@Nullable Output<String> remoteMountDirPath) {
            $.remoteMountDirPath = remoteMountDirPath;
            return this;
        }

        public Builder remoteMountDirPath(String remoteMountDirPath) {
            return remoteMountDirPath(Output.of(remoteMountDirPath));
        }

        public JobNewClusterClusterMountInfoArgs build() {
            $.localMountDirPath = Objects.requireNonNull($.localMountDirPath, "expected parameter 'localMountDirPath' to be non-null");
            $.networkFilesystemInfo = Objects.requireNonNull($.networkFilesystemInfo, "expected parameter 'networkFilesystemInfo' to be non-null");
            return $;
        }
    }

}
