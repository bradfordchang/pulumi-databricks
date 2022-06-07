# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GitCredentialArgs', 'GitCredential']

@pulumi.input_type
class GitCredentialArgs:
    def __init__(__self__, *,
                 git_provider: pulumi.Input[str],
                 git_username: pulumi.Input[str],
                 personal_access_token: pulumi.Input[str],
                 force: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a GitCredential resource.
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] git_username: user name at Git provider.
        :param pulumi.Input[str] personal_access_token: The personal access token used to authenticate to the corresponding Git provider.
        :param pulumi.Input[bool] force: specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        """
        pulumi.set(__self__, "git_provider", git_provider)
        pulumi.set(__self__, "git_username", git_username)
        pulumi.set(__self__, "personal_access_token", personal_access_token)
        if force is not None:
            pulumi.set(__self__, "force", force)

    @property
    @pulumi.getter(name="gitProvider")
    def git_provider(self) -> pulumi.Input[str]:
        """
        case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        """
        return pulumi.get(self, "git_provider")

    @git_provider.setter
    def git_provider(self, value: pulumi.Input[str]):
        pulumi.set(self, "git_provider", value)

    @property
    @pulumi.getter(name="gitUsername")
    def git_username(self) -> pulumi.Input[str]:
        """
        user name at Git provider.
        """
        return pulumi.get(self, "git_username")

    @git_username.setter
    def git_username(self, value: pulumi.Input[str]):
        pulumi.set(self, "git_username", value)

    @property
    @pulumi.getter(name="personalAccessToken")
    def personal_access_token(self) -> pulumi.Input[str]:
        """
        The personal access token used to authenticate to the corresponding Git provider.
        """
        return pulumi.get(self, "personal_access_token")

    @personal_access_token.setter
    def personal_access_token(self, value: pulumi.Input[str]):
        pulumi.set(self, "personal_access_token", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)


@pulumi.input_type
class _GitCredentialState:
    def __init__(__self__, *,
                 force: Optional[pulumi.Input[bool]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 git_username: Optional[pulumi.Input[str]] = None,
                 personal_access_token: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GitCredential resources.
        :param pulumi.Input[bool] force: specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] git_username: user name at Git provider.
        :param pulumi.Input[str] personal_access_token: The personal access token used to authenticate to the corresponding Git provider.
        """
        if force is not None:
            pulumi.set(__self__, "force", force)
        if git_provider is not None:
            pulumi.set(__self__, "git_provider", git_provider)
        if git_username is not None:
            pulumi.set(__self__, "git_username", git_username)
        if personal_access_token is not None:
            pulumi.set(__self__, "personal_access_token", personal_access_token)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="gitProvider")
    def git_provider(self) -> Optional[pulumi.Input[str]]:
        """
        case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        """
        return pulumi.get(self, "git_provider")

    @git_provider.setter
    def git_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_provider", value)

    @property
    @pulumi.getter(name="gitUsername")
    def git_username(self) -> Optional[pulumi.Input[str]]:
        """
        user name at Git provider.
        """
        return pulumi.get(self, "git_username")

    @git_username.setter
    def git_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_username", value)

    @property
    @pulumi.getter(name="personalAccessToken")
    def personal_access_token(self) -> Optional[pulumi.Input[str]]:
        """
        The personal access token used to authenticate to the corresponding Git provider.
        """
        return pulumi.get(self, "personal_access_token")

    @personal_access_token.setter
    def personal_access_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "personal_access_token", value)


class GitCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 git_username: Optional[pulumi.Input[str]] = None,
                 personal_access_token: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        The resource cluster can be imported using ID of Git credential that could be obtained via REST APIbash

        ```sh
         $ pulumi import databricks:index/gitCredential:GitCredential this <git-credential-id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] git_username: user name at Git provider.
        :param pulumi.Input[str] personal_access_token: The personal access token used to authenticate to the corresponding Git provider.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GitCredentialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        The resource cluster can be imported using ID of Git credential that could be obtained via REST APIbash

        ```sh
         $ pulumi import databricks:index/gitCredential:GitCredential this <git-credential-id>
        ```

        :param str resource_name: The name of the resource.
        :param GitCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GitCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 git_provider: Optional[pulumi.Input[str]] = None,
                 git_username: Optional[pulumi.Input[str]] = None,
                 personal_access_token: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GitCredentialArgs.__new__(GitCredentialArgs)

            __props__.__dict__["force"] = force
            if git_provider is None and not opts.urn:
                raise TypeError("Missing required property 'git_provider'")
            __props__.__dict__["git_provider"] = git_provider
            if git_username is None and not opts.urn:
                raise TypeError("Missing required property 'git_username'")
            __props__.__dict__["git_username"] = git_username
            if personal_access_token is None and not opts.urn:
                raise TypeError("Missing required property 'personal_access_token'")
            __props__.__dict__["personal_access_token"] = personal_access_token
        super(GitCredential, __self__).__init__(
            'databricks:index/gitCredential:GitCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            force: Optional[pulumi.Input[bool]] = None,
            git_provider: Optional[pulumi.Input[str]] = None,
            git_username: Optional[pulumi.Input[str]] = None,
            personal_access_token: Optional[pulumi.Input[str]] = None) -> 'GitCredential':
        """
        Get an existing GitCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        :param pulumi.Input[str] git_provider: case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        :param pulumi.Input[str] git_username: user name at Git provider.
        :param pulumi.Input[str] personal_access_token: The personal access token used to authenticate to the corresponding Git provider.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GitCredentialState.__new__(_GitCredentialState)

        __props__.__dict__["force"] = force
        __props__.__dict__["git_provider"] = git_provider
        __props__.__dict__["git_username"] = git_username
        __props__.__dict__["personal_access_token"] = personal_access_token
        return GitCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        """
        specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="gitProvider")
    def git_provider(self) -> pulumi.Output[str]:
        """
        case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
        """
        return pulumi.get(self, "git_provider")

    @property
    @pulumi.getter(name="gitUsername")
    def git_username(self) -> pulumi.Output[str]:
        """
        user name at Git provider.
        """
        return pulumi.get(self, "git_username")

    @property
    @pulumi.getter(name="personalAccessToken")
    def personal_access_token(self) -> pulumi.Output[str]:
        """
        The personal access token used to authenticate to the corresponding Git provider.
        """
        return pulumi.get(self, "personal_access_token")

