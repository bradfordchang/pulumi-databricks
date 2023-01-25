// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobGitSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobGitSourceArgs Empty = new JobGitSourceArgs();

    /**
     * name of the Git branch to use. Conflicts with `tag` and `commit`.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return name of the Git branch to use. Conflicts with `tag` and `commit`.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * hash of Git commit to use. Conflicts with `branch` and `tag`.
     * 
     */
    @Import(name="commit")
    private @Nullable Output<String> commit;

    /**
     * @return hash of Git commit to use. Conflicts with `branch` and `tag`.
     * 
     */
    public Optional<Output<String>> commit() {
        return Optional.ofNullable(this.commit);
    }

    /**
     * case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
     * 
     */
    @Import(name="provider")
    private @Nullable Output<String> provider;

    /**
     * @return case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
     * 
     */
    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    /**
     * name of the Git branch to use. Conflicts with `branch` and `commit`.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return name of the Git branch to use. Conflicts with `branch` and `commit`.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * URL of the Git repository to use.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL of the Git repository to use.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private JobGitSourceArgs() {}

    private JobGitSourceArgs(JobGitSourceArgs $) {
        this.branch = $.branch;
        this.commit = $.commit;
        this.provider = $.provider;
        this.tag = $.tag;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobGitSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobGitSourceArgs $;

        public Builder() {
            $ = new JobGitSourceArgs();
        }

        public Builder(JobGitSourceArgs defaults) {
            $ = new JobGitSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch name of the Git branch to use. Conflicts with `tag` and `commit`.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch name of the Git branch to use. Conflicts with `tag` and `commit`.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param commit hash of Git commit to use. Conflicts with `branch` and `tag`.
         * 
         * @return builder
         * 
         */
        public Builder commit(@Nullable Output<String> commit) {
            $.commit = commit;
            return this;
        }

        /**
         * @param commit hash of Git commit to use. Conflicts with `branch` and `tag`.
         * 
         * @return builder
         * 
         */
        public Builder commit(String commit) {
            return commit(Output.of(commit));
        }

        /**
         * @param provider case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param tag name of the Git branch to use. Conflicts with `branch` and `commit`.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag name of the Git branch to use. Conflicts with `branch` and `commit`.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param url URL of the Git repository to use.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the Git repository to use.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public JobGitSourceArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
