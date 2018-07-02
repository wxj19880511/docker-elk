
# Doc
https://willthames.github.io/devops-singapore-2016/01-intro.html#/set-up-target-hosts

# SSH
ssh-keygen -f ansible
ssh-add ~/.ssh/ansible
ssh-copy-id -f ~/.ssh/ansible $targethos

# SSH keygen
1. ssh-keygen -t rsa
Press enter for each line 
2. cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys
3. chmod og-wx ~/.ssh/authorized_keys

# Example to deploy elk by using ansible
https://github.com/sadsfae/ansible-elk

# Ansible examples
https://github.com/ansible/ansible-examples

# Ansible modules
https://docs.ansible.com/ansible/latest/modules/modules_by_category.html

# Yaml define hosts
https://github.com/ansible/ansible/blob/devel/examples/hosts.yaml
