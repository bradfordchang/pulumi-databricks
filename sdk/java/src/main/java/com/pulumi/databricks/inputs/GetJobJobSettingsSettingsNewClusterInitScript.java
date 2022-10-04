// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNewClusterInitScriptDbfs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNewClusterInitScriptFile;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNewClusterInitScriptGcs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNewClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsNewClusterInitScript extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsNewClusterInitScript Empty = new GetJobJobSettingsSettingsNewClusterInitScript();

    @Import(name="dbfs")
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs;

    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file;

    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs;

    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3;

    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    private GetJobJobSettingsSettingsNewClusterInitScript() {}

    private GetJobJobSettingsSettingsNewClusterInitScript(GetJobJobSettingsSettingsNewClusterInitScript $) {
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsNewClusterInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsNewClusterInitScript $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsNewClusterInitScript();
        }

        public Builder(GetJobJobSettingsSettingsNewClusterInitScript defaults) {
            $ = new GetJobJobSettingsSettingsNewClusterInitScript(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder file(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file) {
            $.file = file;
            return this;
        }

        public Builder gcs(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder s3(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3) {
            $.s3 = s3;
            return this;
        }

        public GetJobJobSettingsSettingsNewClusterInitScript build() {
            return $;
        }
    }

}
