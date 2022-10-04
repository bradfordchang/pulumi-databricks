// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNotebookTask {
    private @Nullable Map<String,Object> baseParameters;
    private String notebookPath;

    private GetJobJobSettingsSettingsNotebookTask() {}
    public Map<String,Object> baseParameters() {
        return this.baseParameters == null ? Map.of() : this.baseParameters;
    }
    public String notebookPath() {
        return this.notebookPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNotebookTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> baseParameters;
        private String notebookPath;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNotebookTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.notebookPath = defaults.notebookPath;
        }

        @CustomType.Setter
        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {
            this.baseParameters = baseParameters;
            return this;
        }
        @CustomType.Setter
        public Builder notebookPath(String notebookPath) {
            this.notebookPath = Objects.requireNonNull(notebookPath);
            return this;
        }
        public GetJobJobSettingsSettingsNotebookTask build() {
            final var o = new GetJobJobSettingsSettingsNotebookTask();
            o.baseParameters = baseParameters;
            o.notebookPath = notebookPath;
            return o;
        }
    }
}
