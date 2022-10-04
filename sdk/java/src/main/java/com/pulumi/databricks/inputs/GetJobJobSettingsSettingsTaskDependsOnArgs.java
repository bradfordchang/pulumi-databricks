// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskDependsOnArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskDependsOnArgs Empty = new GetJobJobSettingsSettingsTaskDependsOnArgs();

    @Import(name="taskKey")
    private @Nullable Output<String> taskKey;

    public Optional<Output<String>> taskKey() {
        return Optional.ofNullable(this.taskKey);
    }

    private GetJobJobSettingsSettingsTaskDependsOnArgs() {}

    private GetJobJobSettingsSettingsTaskDependsOnArgs(GetJobJobSettingsSettingsTaskDependsOnArgs $) {
        this.taskKey = $.taskKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskDependsOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskDependsOnArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskDependsOnArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskDependsOnArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskDependsOnArgs(Objects.requireNonNull(defaults));
        }

        public Builder taskKey(@Nullable Output<String> taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        public Builder taskKey(String taskKey) {
            return taskKey(Output.of(taskKey));
        }

        public GetJobJobSettingsSettingsTaskDependsOnArgs build() {
            return $;
        }
    }

}