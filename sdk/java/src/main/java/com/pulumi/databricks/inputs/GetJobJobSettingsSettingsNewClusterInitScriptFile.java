// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsNewClusterInitScriptFile extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsNewClusterInitScriptFile Empty = new GetJobJobSettingsSettingsNewClusterInitScriptFile();

    @Import(name="destination")
    private @Nullable String destination;

    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    private GetJobJobSettingsSettingsNewClusterInitScriptFile() {}

    private GetJobJobSettingsSettingsNewClusterInitScriptFile(GetJobJobSettingsSettingsNewClusterInitScriptFile $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsNewClusterInitScriptFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsNewClusterInitScriptFile $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsNewClusterInitScriptFile();
        }

        public Builder(GetJobJobSettingsSettingsNewClusterInitScriptFile defaults) {
            $ = new GetJobJobSettingsSettingsNewClusterInitScriptFile(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsNewClusterInitScriptFile build() {
            return $;
        }
    }

}