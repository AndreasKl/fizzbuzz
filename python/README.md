# FizzBuzz

The project is setup with: https://github.com/astral-sh/uv

```bash
# Init and activate venv
uv venv
source .venv/bin/activate
# Run app
uv run -m main -min 5 -max 16
# Run tests
uv run -m  unittest discover -s tests -p "test_*.py" -v
# Format
uv run ruff format
# Lint
uv run ruff check
uv run ruff check --fix
```
