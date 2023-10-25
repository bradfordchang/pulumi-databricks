# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AccessControlRuleSetArgs', 'AccessControlRuleSet']

@pulumi.input_type
class AccessControlRuleSetArgs:
    def __init__(__self__, *,
                 grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessControlRuleSet resource.
        :param pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]] grant_rules: The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
               
               !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        :param pulumi.Input[str] name: Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
               * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
               * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
               * `accounts/{account_id}/ruleSets/default`
        """
        AccessControlRuleSetArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            grant_rules=grant_rules,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if grant_rules is None and 'grantRules' in kwargs:
            grant_rules = kwargs['grantRules']

        if grant_rules is not None:
            _setter("grant_rules", grant_rules)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="grantRules")
    def grant_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]]:
        """
        The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.

        !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        """
        return pulumi.get(self, "grant_rules")

    @grant_rules.setter
    def grant_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]]):
        pulumi.set(self, "grant_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
        * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
        * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
        * `accounts/{account_id}/ruleSets/default`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AccessControlRuleSetState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[str]] = None,
                 grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessControlRuleSet resources.
        :param pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]] grant_rules: The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
               
               !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        :param pulumi.Input[str] name: Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
               * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
               * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
               * `accounts/{account_id}/ruleSets/default`
        """
        _AccessControlRuleSetState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            etag=etag,
            grant_rules=grant_rules,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             etag: Optional[pulumi.Input[str]] = None,
             grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if grant_rules is None and 'grantRules' in kwargs:
            grant_rules = kwargs['grantRules']

        if etag is not None:
            _setter("etag", etag)
        if grant_rules is not None:
            _setter("grant_rules", grant_rules)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter(name="grantRules")
    def grant_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]]:
        """
        The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.

        !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        """
        return pulumi.get(self, "grant_rules")

    @grant_rules.setter
    def grant_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessControlRuleSetGrantRuleArgs']]]]):
        pulumi.set(self, "grant_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
        * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
        * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
        * `accounts/{account_id}/ruleSets/default`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class AccessControlRuleSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessControlRuleSetGrantRuleArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to manage access rules on Databricks account level resources. For convenience we allow accessing this resource through the Databricks account and workspace.

        > **Note** Currently, we only support managing access rules on service principal, group and account resources through `AccessControlRuleSet`.

        > **Warning** `AccessControlRuleSet` cannot be used to manage access rules for resources supported by databricks_permissions. Refer to its documentation for more information.

        ## Service principal rule set usage

        Through a Databricks workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        ds = databricks.get_group(display_name="Data Science")
        automation_sp = databricks.ServicePrincipal("automationSp", display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        Through AWS Databricks account:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        # account level group creation
        ds = databricks.Group("ds")
        automation_sp = databricks.ServicePrincipal("automationSp", display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        Through Azure Databricks account:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        # account level group creation
        ds = databricks.Group("ds")
        automation_sp = databricks.ServicePrincipal("automationSp",
            application_id="00000000-0000-0000-0000-000000000000",
            display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        Through GCP Databricks account:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        # account level group creation
        ds = databricks.Group("ds")
        automation_sp = databricks.ServicePrincipal("automationSp", display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        ## Group rule set usage

        Refer to the appropriate provider configuration as shown in the examples for service principal rule set.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        ds = databricks.get_group(display_name="Data Science")
        john = databricks.get_user(user_name="john.doe@example.com")
        ds_group_rule_set = databricks.AccessControlRuleSet("dsGroupRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[john.acl_principal_id],
            role="roles/group.manager",
        )])
        ```

        ## Account rule set usage

        Refer to the appropriate provider configuration as shown in the examples for service principal rule set.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        ds = databricks.get_group(display_name="Data Science")
        marketplace_admins = databricks.get_group(display_name="Marketplace Admins")
        john = databricks.get_user(user_name="john.doe@example.com")
        account_rule_set = databricks.AccessControlRuleSet("accountRuleSet", grant_rules=[
            databricks.AccessControlRuleSetGrantRuleArgs(
                principals=[john.acl_principal_id],
                role="roles/group.manager",
            ),
            databricks.AccessControlRuleSetGrantRuleArgs(
                principals=[ds.acl_principal_id],
                role="roles/servicePrincipal.manager",
            ),
            databricks.AccessControlRuleSetGrantRuleArgs(
                principals=[marketplace_admins.acl_principal_id],
                role="roles/marketplace.admin",
            ),
        ])
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * Group
        * User
        * ServicePrincipal

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessControlRuleSetGrantRuleArgs']]]] grant_rules: The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
               
               !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        :param pulumi.Input[str] name: Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
               * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
               * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
               * `accounts/{account_id}/ruleSets/default`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccessControlRuleSetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage access rules on Databricks account level resources. For convenience we allow accessing this resource through the Databricks account and workspace.

        > **Note** Currently, we only support managing access rules on service principal, group and account resources through `AccessControlRuleSet`.

        > **Warning** `AccessControlRuleSet` cannot be used to manage access rules for resources supported by databricks_permissions. Refer to its documentation for more information.

        ## Service principal rule set usage

        Through a Databricks workspace:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        ds = databricks.get_group(display_name="Data Science")
        automation_sp = databricks.ServicePrincipal("automationSp", display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        Through AWS Databricks account:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        # account level group creation
        ds = databricks.Group("ds")
        automation_sp = databricks.ServicePrincipal("automationSp", display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        Through Azure Databricks account:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        # account level group creation
        ds = databricks.Group("ds")
        automation_sp = databricks.ServicePrincipal("automationSp",
            application_id="00000000-0000-0000-0000-000000000000",
            display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        Through GCP Databricks account:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        # account level group creation
        ds = databricks.Group("ds")
        automation_sp = databricks.ServicePrincipal("automationSp", display_name="SP_FOR_AUTOMATION")
        automation_sp_rule_set = databricks.AccessControlRuleSet("automationSpRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[ds.acl_principal_id],
            role="roles/servicePrincipal.user",
        )])
        ```

        ## Group rule set usage

        Refer to the appropriate provider configuration as shown in the examples for service principal rule set.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        ds = databricks.get_group(display_name="Data Science")
        john = databricks.get_user(user_name="john.doe@example.com")
        ds_group_rule_set = databricks.AccessControlRuleSet("dsGroupRuleSet", grant_rules=[databricks.AccessControlRuleSetGrantRuleArgs(
            principals=[john.acl_principal_id],
            role="roles/group.manager",
        )])
        ```

        ## Account rule set usage

        Refer to the appropriate provider configuration as shown in the examples for service principal rule set.

        ```python
        import pulumi
        import pulumi_databricks as databricks

        account_id = "00000000-0000-0000-0000-000000000000"
        ds = databricks.get_group(display_name="Data Science")
        marketplace_admins = databricks.get_group(display_name="Marketplace Admins")
        john = databricks.get_user(user_name="john.doe@example.com")
        account_rule_set = databricks.AccessControlRuleSet("accountRuleSet", grant_rules=[
            databricks.AccessControlRuleSetGrantRuleArgs(
                principals=[john.acl_principal_id],
                role="roles/group.manager",
            ),
            databricks.AccessControlRuleSetGrantRuleArgs(
                principals=[ds.acl_principal_id],
                role="roles/servicePrincipal.manager",
            ),
            databricks.AccessControlRuleSetGrantRuleArgs(
                principals=[marketplace_admins.acl_principal_id],
                role="roles/marketplace.admin",
            ),
        ])
        ```

        ## Related Resources

        The following resources are often used in the same context:

        * Group
        * User
        * ServicePrincipal

        :param str resource_name: The name of the resource.
        :param AccessControlRuleSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessControlRuleSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccessControlRuleSetArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessControlRuleSetGrantRuleArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessControlRuleSetArgs.__new__(AccessControlRuleSetArgs)

            __props__.__dict__["grant_rules"] = grant_rules
            __props__.__dict__["name"] = name
            __props__.__dict__["etag"] = None
        super(AccessControlRuleSet, __self__).__init__(
            'databricks:index/accessControlRuleSet:AccessControlRuleSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[str]] = None,
            grant_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessControlRuleSetGrantRuleArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'AccessControlRuleSet':
        """
        Get an existing AccessControlRuleSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessControlRuleSetGrantRuleArgs']]]] grant_rules: The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
               
               !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        :param pulumi.Input[str] name: Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
               * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
               * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
               * `accounts/{account_id}/ruleSets/default`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessControlRuleSetState.__new__(_AccessControlRuleSetState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["grant_rules"] = grant_rules
        __props__.__dict__["name"] = name
        return AccessControlRuleSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter(name="grantRules")
    def grant_rules(self) -> pulumi.Output[Optional[Sequence['outputs.AccessControlRuleSetGrantRule']]]:
        """
        The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.

        !> **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
        """
        return pulumi.get(self, "grant_rules")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
        * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
        * `accounts/{account_id}/groups/{group_id}/ruleSets/default`
        * `accounts/{account_id}/ruleSets/default`
        """
        return pulumi.get(self, "name")

