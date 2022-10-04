// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptFileArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptS3Args;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs Empty = new GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs();

    @Import(name="dbfs")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfsArgs> dbfs;

    public Optional<Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptFileArgs> file;

    public Optional<Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs> gcs;

    public Optional<Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptS3Args> s3;

    public Optional<Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs() {}

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs(GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs $) {
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder dbfs(GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        public Builder file(@Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptFileArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(GetJobJobSettingsSettingsTaskNewClusterInitScriptFileArgs file) {
            return file(Output.of(file));
        }

        public Builder gcs(@Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder s3(@Nullable Output<GetJobJobSettingsSettingsTaskNewClusterInitScriptS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(GetJobJobSettingsSettingsTaskNewClusterInitScriptS3Args s3) {
            return s3(Output.of(s3));
        }

        public GetJobJobSettingsSettingsTaskNewClusterInitScriptArgs build() {
            return $;
        }
    }

}
