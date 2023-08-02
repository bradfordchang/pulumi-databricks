// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobGitSourceJobSource {
    private @Nullable String dirtyState;
    private String importFromGitBranch;
    private String jobConfigPath;

    private JobGitSourceJobSource() {}
    public Optional<String> dirtyState() {
        return Optional.ofNullable(this.dirtyState);
    }
    public String importFromGitBranch() {
        return this.importFromGitBranch;
    }
    public String jobConfigPath() {
        return this.jobConfigPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobGitSourceJobSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dirtyState;
        private String importFromGitBranch;
        private String jobConfigPath;
        public Builder() {}
        public Builder(JobGitSourceJobSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dirtyState = defaults.dirtyState;
    	      this.importFromGitBranch = defaults.importFromGitBranch;
    	      this.jobConfigPath = defaults.jobConfigPath;
        }

        @CustomType.Setter
        public Builder dirtyState(@Nullable String dirtyState) {
            this.dirtyState = dirtyState;
            return this;
        }
        @CustomType.Setter
        public Builder importFromGitBranch(String importFromGitBranch) {
            this.importFromGitBranch = Objects.requireNonNull(importFromGitBranch);
            return this;
        }
        @CustomType.Setter
        public Builder jobConfigPath(String jobConfigPath) {
            this.jobConfigPath = Objects.requireNonNull(jobConfigPath);
            return this;
        }
        public JobGitSourceJobSource build() {
            final var o = new JobGitSourceJobSource();
            o.dirtyState = dirtyState;
            o.importFromGitBranch = importFromGitBranch;
            o.jobConfigPath = jobConfigPath;
            return o;
        }
    }
}
