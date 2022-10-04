// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsSparkJarTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsSparkJarTask Empty = new GetJobJobSettingsSettingsSparkJarTask();

    @Import(name="jarUri")
    private @Nullable String jarUri;

    public Optional<String> jarUri() {
        return Optional.ofNullable(this.jarUri);
    }

    @Import(name="mainClassName")
    private @Nullable String mainClassName;

    public Optional<String> mainClassName() {
        return Optional.ofNullable(this.mainClassName);
    }

    @Import(name="parameters")
    private @Nullable List<String> parameters;

    public Optional<List<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetJobJobSettingsSettingsSparkJarTask() {}

    private GetJobJobSettingsSettingsSparkJarTask(GetJobJobSettingsSettingsSparkJarTask $) {
        this.jarUri = $.jarUri;
        this.mainClassName = $.mainClassName;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsSparkJarTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsSparkJarTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsSparkJarTask();
        }

        public Builder(GetJobJobSettingsSettingsSparkJarTask defaults) {
            $ = new GetJobJobSettingsSettingsSparkJarTask(Objects.requireNonNull(defaults));
        }

        public Builder jarUri(@Nullable String jarUri) {
            $.jarUri = jarUri;
            return this;
        }

        public Builder mainClassName(@Nullable String mainClassName) {
            $.mainClassName = mainClassName;
            return this;
        }

        public Builder parameters(@Nullable List<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public GetJobJobSettingsSettingsSparkJarTask build() {
            return $;
        }
    }

}