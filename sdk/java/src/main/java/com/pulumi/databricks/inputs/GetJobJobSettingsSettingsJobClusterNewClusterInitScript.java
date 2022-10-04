// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsJobClusterNewClusterInitScript extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterInitScript Empty = new GetJobJobSettingsSettingsJobClusterNewClusterInitScript();

    @Import(name="dbfs")
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs dbfs;

    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile file;

    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs gcs;

    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3 s3;

    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScript() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScript(GetJobJobSettingsSettingsJobClusterNewClusterInitScript $) {
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterInitScript $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScript();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScript defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScript(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfs dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder file(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile file) {
            $.file = file;
            return this;
        }

        public Builder gcs(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcs gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder s3(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3 s3) {
            $.s3 = s3;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterInitScript build() {
            return $;
        }
    }

}
