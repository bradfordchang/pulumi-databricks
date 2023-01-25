// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfo;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo Empty = new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo();

    @Import(name="localMountDirPath", required=true)
    private String localMountDirPath;

    public String localMountDirPath() {
        return this.localMountDirPath;
    }

    @Import(name="networkFilesystemInfo", required=true)
    private GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;

    public GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }

    @Import(name="remoteMountDirPath")
    private @Nullable String remoteMountDirPath;

    public Optional<String> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo(GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo $) {
        this.localMountDirPath = $.localMountDirPath;
        this.networkFilesystemInfo = $.networkFilesystemInfo;
        this.remoteMountDirPath = $.remoteMountDirPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo(Objects.requireNonNull(defaults));
        }

        public Builder localMountDirPath(String localMountDirPath) {
            $.localMountDirPath = localMountDirPath;
            return this;
        }

        public Builder networkFilesystemInfo(GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo) {
            $.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }

        public Builder remoteMountDirPath(@Nullable String remoteMountDirPath) {
            $.remoteMountDirPath = remoteMountDirPath;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfo build() {
            $.localMountDirPath = Objects.requireNonNull($.localMountDirPath, "expected parameter 'localMountDirPath' to be non-null");
            $.networkFilesystemInfo = Objects.requireNonNull($.networkFilesystemInfo, "expected parameter 'networkFilesystemInfo' to be non-null");
            return $;
        }
    }

}
