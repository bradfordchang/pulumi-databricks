// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace Empty = new GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace();

    @Import(name="destination")
    private @Nullable String destination;

    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace() {}

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace(GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspace build() {
            return $;
        }
    }

}
