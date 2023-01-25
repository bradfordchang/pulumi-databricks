// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptAbfss;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptFile;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskNewClusterInitScript {
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptAbfss abfss;
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfs dbfs;
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptFile file;
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs gcs;
    private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptS3 s3;

    private GetJobJobSettingsSettingsTaskNewClusterInitScript() {}
    public Optional<GetJobJobSettingsSettingsTaskNewClusterInitScriptAbfss> abfss() {
        return Optional.ofNullable(this.abfss);
    }
    public Optional<GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetJobJobSettingsSettingsTaskNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<GetJobJobSettingsSettingsTaskNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptAbfss abfss;
        private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfs dbfs;
        private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptFile file;
        private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs gcs;
        private @Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptS3 s3;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskNewClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abfss = defaults.abfss;
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder abfss(@Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptAbfss abfss) {
            this.abfss = abfss;
            return this;
        }
        @CustomType.Setter
        public Builder dbfs(@Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable GetJobJobSettingsSettingsTaskNewClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }
        public GetJobJobSettingsSettingsTaskNewClusterInitScript build() {
            final var o = new GetJobJobSettingsSettingsTaskNewClusterInitScript();
            o.abfss = abfss;
            o.dbfs = dbfs;
            o.file = file;
            o.gcs = gcs;
            o.s3 = s3;
            return o;
        }
    }
}
